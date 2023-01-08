package cc.omoz.sparrow.daos.postgresql

import cc.omoz.sparrow.beans.Ipv6AddressGeo
import org.springframework.stereotype.Repository

/**
 * ipv6 数据库访问服务
 * @author ThinkTik
 */
@Repository

interface Ipv6Dao {
    /**
     * 根据ipv6 ipNum获取地理位置详情
     * @param ipNum ipv6地址 数值
     * @return ipv6地址所在的地理位置详情
     */
    Ipv6AddressGeo queryAddress(BigInteger ipNum)
}