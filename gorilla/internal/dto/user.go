package dto

type Account struct {
	UserId   string `gorm:"primaryKey;column:user_id"`
	Username string `gorm:"column:username"`
	Password string `gorm:"column:passwd"`
}
