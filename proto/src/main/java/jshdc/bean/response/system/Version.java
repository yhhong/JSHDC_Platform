package jshdc.bean.response.system;

/**
 * 版本号
 * Created by yinghuihong on 16/5/20.
 */
public class Version {
    public String versionCode;
    public String fileUrl;
    public long fileLength;
    public String description;

    public Version(String versionCode, String fileUrl, long fileLength, String description) {
        this.versionCode = versionCode;
        this.fileUrl = fileUrl;
        this.fileLength = fileLength;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Version{" +
                "versionCode='" + versionCode + '\'' +
                ", fileUrl='" + fileUrl + '\'' +
                ", fileLength='" + fileLength + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
