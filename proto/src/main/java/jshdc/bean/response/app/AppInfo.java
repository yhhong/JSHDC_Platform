package jshdc.bean.response.app;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class AppInfo {

    public String appId;
    public String appTypeId;
    public String version;
    public String name;
    public String description;
    public String appTypeClass;
    public String appTypePackage;
    public String downloadTimes;
    public String downloadUrl;
    public String score;
    public boolean chargeFlag;
    public String price;
    public boolean visibleFlag;
    public String appLevel;
    public String icon;
    public String poster;
    public long packageSize;
    public String developer;

    public AppInfo() {
    }

    public AppInfo(String appId, String appTypeId, String version, String name, String description, String appTypeClass,
                   String appTypePackage, String downloadTimes, String downloadUrl, String score, boolean chargeFlag,
                   String price, boolean visibleFlag, String appLevel, String icon, String poster, long packageSize, String developer) {
        this.appId = appId;
        this.appTypeId = appTypeId;
        this.version = version;
        this.name = name;
        this.description = description;
        this.appTypeClass = appTypeClass;
        this.appTypePackage = appTypePackage;
        this.downloadTimes = downloadTimes;
        this.downloadUrl = downloadUrl;
        this.score = score;
        this.chargeFlag = chargeFlag;
        this.price = price;
        this.visibleFlag = visibleFlag;
        this.appLevel = appLevel;
        this.icon = icon;
        this.poster = poster;
        this.packageSize = packageSize;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "appId='" + appId + '\'' +
                ", appTypeId='" + appTypeId + '\'' +
                ", version='" + version + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", appTypeClass='" + appTypeClass + '\'' +
                ", appTypePackage='" + appTypePackage + '\'' +
                ", downloadTimes='" + downloadTimes + '\'' +
                ", downloadUrl='" + downloadUrl + '\'' +
                ", score='" + score + '\'' +
                ", chargeFlag=" + chargeFlag +
                ", price='" + price + '\'' +
                ", visibleFlag=" + visibleFlag +
                ", appLevel='" + appLevel + '\'' +
                ", icon='" + icon + '\'' +
                ", poster='" + poster + '\'' +
                ", packageSize='" + packageSize + '\'' +
                ", developer='" + developer + '\'' +
                '}';
    }
}
