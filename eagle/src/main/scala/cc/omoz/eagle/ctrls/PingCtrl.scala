package cc.omoz.eagle.ctrls

import cc.omoz.facade.omoz.dto.impl.OmozHttpResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.{GetMapping, RestController}

import java.util

/**
 * 存活性(liveless)探针控制器
 *
 * @author ThinkTik
 */
@RestController
class PingCtrl(
                // 应用程序名
                @Value("${spring.application.name}") val appName: String,
                // 描述
                @Value("${description}") val description: String,
                // index 主页URL
                @Value("${indexUrl}") val indexUrl: String
              ) {
  @GetMapping(value = Array("/ping"))
  def ping(): OmozHttpResponse[util.Map[String, String]] = {
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