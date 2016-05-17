package jshdc.bean.response.app;

import java.util.List;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class GetAppRecommendResp {

    public int result;
    public String message;
    public List<AppInfo> appInfos;

    @Override
    public String toString() {
        return "GetAppRecommendResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", appInfos=" + appInfos +
                '}';
    }
}
