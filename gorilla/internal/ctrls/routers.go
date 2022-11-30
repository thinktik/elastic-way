package ctrls

import (
	"github.com/gin-gonic/gin"
)

func StartRouter() {

	// 创建路由
	r := gin.Default()
	gin.SetMode(gin.ReleaseMode)
	indexG(r)
	pingG(r)
	// 监听端口，默认8080
	err := r.Run(":8087")
	if err != nil {
		return
	}
}
