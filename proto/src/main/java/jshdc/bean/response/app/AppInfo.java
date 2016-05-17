package jshdc.bean.response.app;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class AppInfo {

    public String appId;
    public String appTypeId;
    public String appCode;
    public String appName;
    public String appDesc;
    public String appTypeClass;
    public String appTypePackage;
    public String downloadTimes;
    public String downloadUrl;
    public String score;
    public boolean chargeFlag;
    public String price;
    public boolean visibleFlag;
    public String appLevel;
    public String appSlogo;
    public String appLogo;
    public String size;

    public AppInfo() {
    }

    public AppInfo(String appId, String appTypeId, String appCode, String appName, String appDesc, String appTypeClass,
                   String appTypePackage, String downloadTimes, String downloadUrl, String score, boolean chargeFlag,
                   String price, boolean visibleFlag, String appLevel, String appSlogo, String appLogo, String size) {
        this.appId = appId;
        this.appTypeId = appTypeId;
        this.appCode = appCode;
        this.appName = appName;
        this.appDesc = appDesc;
        this.appTypeClass = appTypeClass;
        this.appTypePackage = appTypePackage;
        this.downloadTimes = downloadTimes;
        this.downloadUrl = downloadUrl;
        this.score = score;
        this.chargeFlag = chargeFlag;
        this.price = price;
        this.visibleFlag = visibleFlag;
        this.appLevel = appLevel;
        this.appSlogo = appSlogo;
        this.appLogo = appLogo;
        this.size = size;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "appId='" + appId + '\'' +
                ", appTypeId='" + appTypeId + '\'' +
                ", appCode='" + appCode + '\'' +
                ", appName='" + appName + '\'' +
                ", appDesc='" + appDesc + '\'' +
                ", appTypeClass='" + appTypeClass + '\'' +
                ", appTypePackage='" + appTypePackage + '\'' +
                ", downloadTimes='" + downloadTimes + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", score='" + score + '\'' +
                ", chargeFlag=" + chargeFlag +
                ", price='" + price + '\'' +
                ", visibleFlag=" + visibleFlag +
                ", appLevel='" + appLevel + '\'' +
                ", appSlogo='" + appSlogo + '\'' +
                ", appLogo='" + appLogo + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
