package cc.omoz.eagle.ctrls

import cc.omoz.facade.omoz.dto.impl.OmozHttpResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.{GetMapping, RestController}

import java.util

/**
 * index控制器
 *
 * @author ThinkTik
 */
@RestController
class IndexCtrl(
                 @Value("${spring.application.name}") val appName: String,
                 @Value("${description}") val description: String,
                 @Value("${indexUrl}") val indexUrl: String
               ) {
  @GetMapping(value = Array("/index"))
  def index(): OmozHttpResponse[util.Map[String, String]] = {
    val response = new OmozHttpResponse[util.Map[String, String]]()
    val data = new util.HashMap[String, String]()
    data.put("appName", appName)
    data.put("description", description)
    response.setCode(200)
    response.setMessage("success")
    response.setData(data)

    response
  }
}