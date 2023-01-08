package cc.omoz.sparrow.beans


/**
 * 短网址
 * @author ThinkTik
 */
class ShortURL {
    /**
     * 域名
     * */
    private String domainName
    /**
     * 路经
     * */
    private String path
    /**
     * 参数
     * */
    private String param

    ShortURL() {}

    String getDomainName() {
        return domainName
    }

    void setDomainName(String domainName) {
        this.domainName = domainName
    }

    String getPath() {
        return path
    }

    void setPath(String path) {
        this.path = path
    }

    String getParam() {
        return param
    }

    void setParam(String param) {
        this.param = param
    }
}
