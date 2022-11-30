package cc.omoz.sparrow.svcs.impl

import cc.omoz.sparrow.beans.Ipv6AddressGeo
import cc.omoz.sparrow.daos.postgresql.Ipv6Dao
import cc.omoz.sparrow.svcs.Ipv6Svc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * ipv6 服务 实现
 * @author ThinkTik
 */
@Service
class Ipv6SvcImpl implements Ipv6Svc {
    @Autowired
    private Ipv6Dao ipv6Dao

    @Override
    Ipv6AddressGeo ipAddress(BigInteger ipNum) {
        Ipv6AddressGeo ipv6Address = ipv6Dao.queryAddress(ipNum)
        return ipv6Address
    }
}
