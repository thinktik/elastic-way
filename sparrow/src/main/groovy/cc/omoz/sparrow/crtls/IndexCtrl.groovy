package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.HttpResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * index控制器
 * @author ThinkTik
 */
@RestController
@RequestMapping('/')
class IndexCtrl {

    /**
     * 应用程序名
     * */
    @Value('${spring.application.name}')
    private String appName

    /**
     * 描述
     * */
    @Value('${description}')
    private String description

    /**
     * index 主页URL
     * */
    @Value('${indexUrl}')
    private String indexUrl

    /**
     * @return index api
     */
    @GetMapping(value = ["", "/index"])
    HttpResponse<Map<String, String>> index() {
        HttpResponse<Map<String, String>> response = new HttpResponse<>()
        response.setCode(200)
        response.setMessage("success")
        Map<String, String> data = new HashMap<>(4)
        data.put("appName", appName)
        data.put("description", description)
        data.put("indexUrl", indexUrl)
        response.setData(data)
        return response
    }
}