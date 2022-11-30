package cc.omoz.sparrow.ctrls

import cc.omoz.facade.omoz.dto.impl.OmozHttpResponse
import cc.omoz.sparrow.beans.Ipv6AddressGeo
import cc.omoz.sparrow.svcs.Ipv6Svc
import cc.omoz.sparrow.utils.Ipv6Tools
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * ipv6 控制器
 * @author ThinkTik
 */
@RestController
@RequestMapping(value = "/ipv6")
class Ipv6Ctrl {
    @Autowired
    private Ipv6Svc ipv6Svc

    /**
     * 根据ipv6 IP地址获取地理位置
     * @param ipv6 IP地址
     * @return ipv6所在的地理位置的详细信息
     */
    @GetMapping(value = "/{ipv6}")
    OmozHttpResponse<Map<String, Ipv6AddressGeo>> ipv4(@PathVariable("ipv6") String ipv6) {
        OmozHttpResponse<Map<String, Ipv6AddressGeo>> response = new OmozHttpResponse<>()
        response.setCode(200)
        response.setMessage("success")
        // 清理可能的首尾空格
        ipv6 = StringUtils.deleteWhitespace(ipv6)
        BigInteger ipNum = Ipv6Tools.dot2LongIp(ipv6)
        Ipv6AddressGeo ipv6Address = ipv6Svc.ipAddress(ipNum)
        Map<String, Ipv6AddressGeo> data = new HashMap<>(1)
        data.put("ipv6Address", ipv6Address)
        response.setData(data)
        return response
    }
}
