package jshdc.bean.response.common;

/**
 * 用户登录
 * Created by yinghuihong on 16/1/26.
 */
public class UserLoginResp {

    public int resultCode;
    public String resultDesc;
    public String userToken;
    /**
     * 间隔刷新时间,单位为秒
     */
    public int intervalTime;

    @Override
    public String toString() {
        return "UserLoginResp{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                ", userToken='" + userToken + '\'' +
                ", intervalTime=" + intervalTime +
                '}';
    }
}
