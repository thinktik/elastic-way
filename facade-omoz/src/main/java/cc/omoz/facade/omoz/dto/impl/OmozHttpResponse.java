package cc.omoz.facade.omoz.dto.impl;

import cc.omoz.facade.omoz.dto.OmozResponse;

/**
 * HTTP 端点件通信的格式规范(具体实现)
 *
 * @author ThinkTik
 */
public final class OmozHttpResponse<T> extends OmozResponse<T> {
    public OmozHttpResponse() {
    }

    public OmozHttpResponse(Integer code, String message, T data) {
        super(code, message, data);
    }
}
