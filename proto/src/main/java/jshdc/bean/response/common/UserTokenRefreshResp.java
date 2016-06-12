package jshdc.bean.response.common;

/**
 * Created by yinghuihong on 16/3/11.
 */
public class UserTokenRefreshResp {

    public int resultCode;
    public String resultDesc;
    public String userToken;
    /**
     * 间隔刷新时间,单位为秒
     */
    public int intervalTime;

    @Override
    public String toString() {
        return "UserTokenRefreshResp{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                ", userToken='" + userToken + '\'' +
                ", intervalTime='" + intervalTime + '\'' +
                '}';
    }
}
