package cc.omoz.sparrow.beans

import com.fasterxml.jackson.annotation.JsonIgnore

/**
 * ipv4地址
 * @author ThinkTik
 */
class Ipv4AddressGeo {
    /**
     * ip
     * */
    private String ip
    /**
     * ip 数字起始地址
     * */
    @JsonIgnore
    private Long ipFrom
    /**
     * ip 数字结束地址
     * */
    @JsonIgnore
    private Long ipTo
    /**
     * 国家码
     * */
    private String countryCode
    /**
     * 国家名
     * */
    private String countryName
    /**
     * 区域名
     * */
    private String regionName
    /**
     * 城市名
     * */
    private String cityName
    /**
     * 维度
     * */
    private Double latitude
    /**
     * 经度
     * */
    private Double longitude
    /**
     * 邮政编码
     * */
    private String zipCode
    /**
     * 时区偏移
     * */
    private String timezone

    Ipv4AddressGeo() {}

    String getCountryCode() {
        return countryCode
    }

    void setCountryCode(String countryCode) {
        this.countryCode = countryCode
    }

    Long getIpFrom() {
        return ipFrom
    }

    void setIpFrom(Long ipFrom) {
        this.ipFrom = ipFrom
    }

    Long getIpTo() {
        return ipTo
    }

    void setIpTo(Long ipTo) {
        this.ipTo = ipTo
    }

    String getCountryName() {
        return countryName
    }

    void setCountryName(String countryName) {
        this.countryName = countryName
    }

    String getRegionName() {
        return regionName
    }

    void setRegionName(String regionName) {
        this.regionName = regionName
    }

    String getCityName() {
        return cityName
    }

    void setCityName(String cityName) {
        this.cityName = cityName
    }

    Double getLatitude() {
        return latitude
    }

    void setLatitude(Double latitude) {
        this.latitude = latitude
    }

    Double getLongitude() {
        return longitude
    }

    void setLongitude(Double longitude) {
        this.longitude = longitude
    }

    String getZipCode() {
        return zipCode
    }

    void setZipCode(String zipCode) {
        this.zipCode = zipCode
    }

    String getTimezone() {
        return timezone
    }

    void setTimezone(String timezone) {
        this.timezone = timezone
    }

    String getIp() {
        return ip
    }

    void setIp(String ip) {
        this.ip = ip
    }
}