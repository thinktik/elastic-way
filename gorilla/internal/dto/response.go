package dto

type ResponseMata struct {
	Code    int    `map:"code"`
	Message string `map:"message"`
}

type Response struct {
	*ResponseMata
	Data map[string]string `map:"data"`
}

type ResponseError struct {
	*ResponseMata
	Error string
}

func (r Response) ToMap() map[string]interface{} {
	m := map[string]interface{}{
		"code":    r.Code,
		"message": r.Message,
		"data":    r.Data,
	}
	return m
}

func (r ResponseError) ToMap() map[string]interface{} {
	m := map[string]interface{}{
		"code":    r.Code,
		"message": r.Message,
		"error":   r.Error,
	}
	return m
}
