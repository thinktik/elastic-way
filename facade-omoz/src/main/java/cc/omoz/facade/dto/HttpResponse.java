package cc.omoz.facade.dto;

/**
 * HTTP 端点件通信的格式规范(具体实现)
 *
 * @author ThinkTik
 */
public final class HttpResponse<T> extends OmozResponse<T> {
    public HttpResponse() {
    }

    public HttpResponse(Integer code, String message, T data) {
        super(code, message, data);
    }
}
