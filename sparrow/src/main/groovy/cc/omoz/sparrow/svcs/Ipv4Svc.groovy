package cc.omoz.sparrow.svcs

import cc.omoz.sparrow.beans.Ipv4AddressGeo

/**
 * ipv4 服务
 * @author ThinkTik
 */
interface Ipv4Svc {
    /**
     * 根据ipv4 ipNum获取地理位置详情
     * @param ipNum ipv4地址 数值
     * @return ipv4地址所在的地理位置详情
     */
    Ipv4AddressGeo ipAddress(Long ipNum)
}
