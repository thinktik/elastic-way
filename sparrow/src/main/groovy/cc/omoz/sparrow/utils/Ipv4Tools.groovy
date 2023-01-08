package cc.omoz.sparrow.utils

/**
 * ipv4 地址<-->数字 转换工具类
 * @author ThinkTik
 */
class Ipv4Tools {
    /**
     * ip地址 --> ip数字
     * @param ipAddress ip地址
     * @return ip数字
     */
    static long dot2LongIP(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split('\\.')
        long ipNum = 0
        long ip = 0
        for (int x = 3; x >= 0; x--) {
            ip = Long.parseLong(ipAddressInArray[3 - x])
            ipNum |= ip << (x << 3)
        }
        return ipNum
    }

    /**
     * ip数字 --> ip地址
     * @param ipNum ip数字
     * @return ip地址
     */
    static String long2DotIP(long ipNum) {
        String result = ''
        result = ((ipNum / 16777216) % 256) + '.' + ((ipNum / 65536) % 256) + '.' + ((ipNum / 256) % 256) + '.' + (ipNum % 256)
        return result
    }
}