package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.HttpResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/ping')
class PingCtrl {

    /**
     * 应用程序名
     **/
    @Value('${spring.application.name}')
    private String appName

    /**
     * index 主页URL
     * */
    @Value('${indexUrl}')
    private String indexUrl

    /**
     * 描述
     * */
    @Value('${description}')
    private String description

    /**
     * liveless探针
     * @return 本应用程序的描述
     * */
    @GetMapping(value = ["", "/"])
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
