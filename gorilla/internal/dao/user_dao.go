package dao

import (
	"gorm.io/gorm"
	"omoz.cc/gorilla/internal/dto"
)

func InsertUser(user dto.Account) *gorm.DB {
	result := MySQLDB.Table("" +
		"" +
		"").Create(&user)
	return result
}
