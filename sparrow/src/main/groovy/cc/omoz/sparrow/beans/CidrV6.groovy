package cc.omoz.sparrow.beans

/**
 * https://www.rfc-editor.org/rfc/rfc4632
 * @author ThinkTik
 * */
class CidrV6 {
    /**
     * 网络地址
     * */
    private String netAddress
    /**
     *  起始地址
     *  */
    private String startAddress
    /**
     *  结束地址
     *  */
    private String endAddress
    /**
     *  子网掩码
     *  */
    private String subnetMask
    /**
     * IP number
     * */
    private Long ipNumber

    CidrV6() {}

    String getNetAddress() {
        return netAddress
    }

    void setNetAddress(String netAddress) {
        this.netAddress = netAddress
    }

    String getStartAddress() {
        return startAddress
    }

    void setStartAddress(String startAddress) {
        this.startAddress = startAddress
    }

    String getEndAddress() {
        return endAddress
    }

    void setEndAddress(String endAddress) {
        this.endAddress = endAddress
    }

    String getSubnetMask() {
        return subnetMask
    }

    void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask
    }

    Long getIpNumber() {
        return ipNumber
    }

    void setIpNumber(Long ipNumber) {
        this.ipNumber = ipNumber
    }
}
