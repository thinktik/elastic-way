package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.HttpResponse
import cc.omoz.facade.dto.OmozResponse
import cc.omoz.sparrow.beans.Ipv4AddressGeo
import cc.omoz.sparrow.svcs.Ipv4Svc
import cc.omoz.sparrow.utils.Ipv4Tools
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * ipv4 控制器
 * @author ThinkTik
 */
@RestController
@RequestMapping(value = "/ipv4")
class Ipv4Ctrl {
    @Autowired
    private Ipv4Svc ipv4Svc

    /**
     * 根据ipv4 IP地址获取地理位置
     * @param ipv4 IP地址
     * @return ipv4所在的地理位置的详细信息
     */
    @GetMapping(value = "/{ipv4}")
    OmozResponse<Map<String, Ipv4AddressGeo>> ipv4(@PathVariable("ipv4") String ipv4) {
        OmozResponse<Map<String, Ipv4AddressGeo>> response = new HttpResponse<>()
        response.setCode(200)
        response.setMessage("success")
        // 清理可能的首尾空格
        ipv4 = StringUtils.deleteWhitespace(ipv4)
        Long ipNum = Ipv4Tools.dot2LongIP(ipv4)
        Ipv4AddressGeo ipv4Address = ipv4Svc.ipAddress(ipNum)
        ipv4Address.setIp(ipv4)
        Map<String, Ipv4AddressGeo> data = new HashMap<>(1)
        data.put("ipv4Address", ipv4Address)
        response.setData(data)
        return response
    }
}