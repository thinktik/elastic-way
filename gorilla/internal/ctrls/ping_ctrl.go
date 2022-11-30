package ctrls

import (
	"github.com/gin-gonic/gin"
	"net/http"
	"omoz.cc/gorilla/internal/dao"
	"omoz.cc/gorilla/internal/dto"
)

func pingG(engine *gin.Engine) {
	// ping 路由组
	pathG := engine.Group("/")
	// ping 路由组下的子路径
	pathG.GET("/ping", ping)
}

func ping(c *gin.Context) {
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

	dao.MySQLDB.Table("account").Model(&dto.Account{}).Where("username = ?", "thinktik").Update("email", "9695160952@qq.com")

	c.JSON(http.StatusOK, response.ToMap())
}
