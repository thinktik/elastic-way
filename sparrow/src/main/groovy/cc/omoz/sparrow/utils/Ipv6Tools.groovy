package cc.omoz.sparrow.utils

/**
 * ipv6 地址<-->数字 转换工具类
 * @author ThinkTik
 */
class Ipv6Tools {

    /**
     * ip地址 --> ip数字
     * @param ipAddress ip地址
     * @return ip数字
     */
    static BigInteger dot2LongIp(String ipAddress) {
        InetAddress ia = null
        try {
            ia = InetAddress.getByName(ipAddress)
        } catch (UnknownHostException e) {
            throw new RuntimeException(e)
        }
        byte[] byteArr = ia.getAddress()

        if (ia instanceof Inet6Address) {
            return new BigInteger(1, byteArr)
        }
        return null
    }

    /**
     * ip数字 --> ip地址
     * @param ipNum ip数字
     * @return ip地址
     */
    static String long2DotIp(String ipNum) {
        String ipstr = new BigInteger(ipNum).toString(16)
        String padding = new String(new char[32 - ipstr.length()]).replace('\0', '0')
        String retval = padding + ipstr
        retval = retval.replaceAll('(.{4})', '$1:').substring(0, 39)
        return retval
    }
}