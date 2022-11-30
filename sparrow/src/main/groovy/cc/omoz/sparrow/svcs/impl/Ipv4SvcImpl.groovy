package cc.omoz.sparrow.svcs.impl

import cc.omoz.sparrow.beans.Ipv4AddressGeo
import cc.omoz.sparrow.daos.postgresql.Ipv4Dao
import cc.omoz.sparrow.svcs.Ipv4Svc
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * ipv4 服务 实现
 * @author ThinkTik
 */
@Service
class Ipv4SvcImpl implements Ipv4Svc {
    @Autowired
    private Ipv4Dao ipv4Dao

    @Override
    Ipv4AddressGeo ipAddress(Long ipNum) {
        Ipv4AddressGeo ipv4Address = ipv4Dao.queryAddress(ipNum)
        return ipv4Address
    }
}
