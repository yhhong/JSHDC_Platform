package jshdc.bean.response.common;

/**
 * Created by yinghuihong on 16/3/11.
 */
public class UserTokenRefreshResp {

    public int resultCode;
    public String resultDesc;

    @Override
    public String toString() {
        return "UserTokenRefreshResp{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                '}';
    }
}
