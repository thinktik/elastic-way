package ctrls

import (
	"github.com/gin-gonic/gin"
	"net/http"
	"omoz.cc/gorilla/internal/dto"
)

func indexG(engine *gin.Engine) {
	// index 路由组
	pathG := engine.Group("/")
	// index 路由组下的子路径
	pathG.GET("", index)
	pathG.GET("/index", index)
}

func index(c *gin.Context) {
	response := dto.Response{
		ResponseMata: &dto.ResponseMata{
			Code:    200,
			Message: "success",
		},
		Data: map[string]string{
			"developer": "ThinkTik",
			"echo":      "EKS 演练",
			"lang":      "Go 1.18",
		},
	}
	c.JSON(http.StatusOK, response.ToMap())
}
