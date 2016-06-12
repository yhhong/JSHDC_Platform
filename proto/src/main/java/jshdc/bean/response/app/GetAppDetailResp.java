package jshdc.bean.response.app;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class GetAppDetailResp {

    public int result;
    public String message;
    public AppInfo appInfo;

    @Override
    public String toString() {
        return "GetAppDetailResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", appInfo=" + appInfo +
                '}';
    }
}
