package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.HttpResponse
import cc.omoz.facade.dto.OmozResponse
import cc.omoz.sparrow.beans.Ipv4AddressGeo
import cc.omoz.sparrow.svcs.Ipv4Svc
import cc.omoz.sparrow.utils.Ipv4Tools
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * ip 控制器
 * @author ThinkTik
 */
@RestController
@RequestMapping(value = "/ip")
class IpCtrl {
    @Autowired
    private Ipv4Svc ipv4Svc

    /**
     * 根据客户端 IP地址获取地理位置
     * @param 客户端 IP地址
     * @return 客户端 IP地址所在的地理位置的详细信息
     */
    @GetMapping(value = "")
    OmozResponse<Map<String, Ipv4AddressGeo>> ipv4(ServerHttpRequest request) {
        OmozResponse<Map<String, Ipv4AddressGeo>> response = new HttpResponse<>()
        response.setCode(200)
        response.setMessage("success")

        String ipv4 = request.getRemoteAddress().address
        // 清理可能的首尾空格
        ipv4 = StringUtils.deleteWhitespace(ipv4)
        ipv4 = StringUtils.remove(ipv4, "/")
        Long ipNum = Ipv4Tools.dot2LongIP(ipv4)
        Ipv4AddressGeo ipv4Address = ipv4Svc.ipAddress(ipNum)
        ipv4Address.setIp(ipv4)
        Map<String, Ipv4AddressGeo> data = new HashMap<>(1)
        data.put("ipv4Address", ipv4Address)
        response.setData(data)
        return response
    }
}