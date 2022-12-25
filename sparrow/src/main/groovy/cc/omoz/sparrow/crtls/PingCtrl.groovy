package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.HttpResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingCtrl {
    @Value('${spring.application.name}')
    private String appName
    @Value('${indexUrl}')
    private String indexUrl
    @Value('${description}')
    private String description

    @GetMapping("/ping")
    HttpResponse<Map<String, String>> ping() {
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
