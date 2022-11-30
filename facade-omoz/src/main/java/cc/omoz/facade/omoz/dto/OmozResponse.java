package cc.omoz.facade.omoz.dto;

/**
 * HTTP/MQTT/RPC 端点间通信的格式规范
 *
 * @author ThinkTik
 */
public abstract class OmozResponse<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 状态消息
     */
    private String message;
    /**
     * payload消息体
     */
    private T data;

    protected OmozResponse() {
    }

    protected OmozResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
