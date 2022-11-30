package dao

import (
	"gorm.io/driver/mysql"
	"gorm.io/gorm"
	"time"
)

var MySQLDB *gorm.DB

func init() {
	dsn := "thinktik:Secure_123@mys@tcp(mysql-replica.cxf9geexdj8g.us-east-1.rds.amazonaws.com:3306)/think_db?charset=utf8mb4"
	db, err := gorm.Open(mysql.Open(dsn), &gorm.Config{})
	if err != nil {
		panic("failed to connect database")
	}
	dbPool, err := db.DB()
	dbPool.SetMaxOpenConns(4)
	dbPool.SetMaxIdleConns(1)
	dbPool.SetConnMaxIdleTime(time.Minute * 15)
	dbPool.SetConnMaxLifetime(time.Hour * 1)

	MySQLDB = db
}
