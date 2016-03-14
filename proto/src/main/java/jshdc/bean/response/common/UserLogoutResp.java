package jshdc.bean.response.common;

/**
 * Created by yinghuihong on 16/3/11.
 */
public class UserLogoutResp {

    public int resultCode;
    public String resultDesc;

    @Override
    public String toString() {
        return "UserLogoutResp{" +
                "resultCode=" + resultCode +
                ", resultDesc='" + resultDesc + '\'' +
                '}';
    }
}
