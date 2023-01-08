package cc.omoz.sparrow.svcs

import cc.omoz.sparrow.beans.Ipv6AddressGeo

/**
 * ipv6 服务
 * @author ThinkTik
 */
interface Ipv6Svc {
    /**
     * 根据ipv6 ipNum获取地理位置详情
     * @param ipNum ipv6地址 数值
     * @return ipv6地址所在的地理位置详情
     */
    Ipv6AddressGeo ipAddress(BigInteger ipNum)
}