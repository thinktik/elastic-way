package cc.omoz.sparrow.crtls

import cc.omoz.facade.dto.OmozResponse
import cc.omoz.sparrow.beans.Ipv6AddressGeo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * CIDR计算器
 * @author ThinkTik
 */
@RestController
@RequestMapping(value = "/cidr")
class CidrCalc {

    @GetMapping(value = "/{cidr}")
    OmozResponse<Map<String, Ipv6AddressGeo>> cidr(@PathVariable("cidr") String cidr) {

    }

    @GetMapping(value = "/ipv4/{cidr}")
    OmozResponse<Map<String, Ipv6AddressGeo>> cidrIpv4(@PathVariable("cidr") String cidr) {

    }

    @GetMapping(value = "/ipv6/{cidr}")
    OmozResponse<Map<String, Ipv6AddressGeo>> cidrIpv6(@PathVariable("cidr") String cidr) {

    }
}
