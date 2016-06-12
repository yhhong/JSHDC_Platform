package jshdc.bean.response.system;

/**
 * 版本检测
 * Created by yinghuihong on 16/5/20.
 */
public class CheckVersionResp {

    public int result;
    public String message;
    /**
     * 0-不需要，1-需要，2-必须要
     */
    public int update;
    public Version version;

    @Override
    public String toString() {
        return "CheckVersionResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", update=" + update +
                ", version=" + version +
                '}';
    }
}
