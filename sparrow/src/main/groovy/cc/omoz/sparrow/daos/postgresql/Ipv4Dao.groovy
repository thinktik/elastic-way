package cc.omoz.sparrow.daos.postgresql

import cc.omoz.sparrow.beans.Ipv4AddressGeo
import org.springframework.stereotype.Repository

/**
 * ipv4 数据库访问服务
 * @author ThinkTik
 */
@Repository
interface Ipv4Dao {
    /**
     * 根据ipv4 ipNum获取地理位置详情
     * @param ipNum ipv4地址 数值
     * @return ipv4地址所在的地理位置详情
     */
    Ipv4AddressGeo queryAddress(Long ipNum)
}