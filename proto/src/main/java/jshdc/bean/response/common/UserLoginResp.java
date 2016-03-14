package jshdc.bean.response.common;

/**
 * 用户登录
 * Created by yinghuihong on 16/1/26.
 */
public class UserLoginResp {

    public int resultCode;
    public String resultDesc;
    public String userToken;

    @Override
    public String toString() {
        return "UserLoginResp{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                ", userToken='" + userToken + '\'' +
                '}';
    }
}
