package cc.omoz.albatross.ctrls;

import cc.omoz.facade.omoz.dto.impl.OmozHttpResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 存活性(liveless)探针控制器
 *
 * @author ThinkTik
 */
@RestController
@RequestMapping("/ping")
public class PingCtrl {
    /**
     * 应用程序名
     */
    @Value("${spring.application.name}")
    private String appName;
    /**
     * 描述
     */
    @Value("${description}")
    private String description;
    /**
     * index 主页URL
     */
    @Value("${indexUrl}")
    private String indexUrl;

    /**
     * liveless探针
     *
     * @return 本应用程序的描述
     */
    @GetMapping(value = {"", "/"})
    public OmozHttpResponse<Map<String, String>> ping() {
        OmozHttpResponse<Map<String, String>> response = new OmozHttpResponse<>();
        response.setCode(200);
        response.setMessage("success");
        Map<String, String> data = new HashMap<>(4);
        data.put("appName", appName);
        data.put("description", description);
        data.put("indexUrl", indexUrl);
        response.setData(data);
        return response;
    }
}
