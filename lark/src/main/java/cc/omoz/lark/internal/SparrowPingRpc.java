package cc.omoz.lark.internal;

import cc.omoz.facade.omoz.dto.impl.OmozHttpResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author ThinkTik
 */
@FeignClient(name = "sparrow")
public interface SparrowPingRpc {
    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    OmozHttpResponse<Map<String, String>> ping();
}
