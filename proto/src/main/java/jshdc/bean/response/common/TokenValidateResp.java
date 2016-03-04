package jshdc.bean.response.common;

import jshdc.bean.User;

/**
 * 全网统一认证TOKEN验证
 * Created by yinghuihong on 16/1/26.
 */
public class TokenValidateResp {

    public int result;
    public String message;
    public User user;

    @Override
    public String toString() {
        return "TokenValidateResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", user=" + user +
                '}';
    }
}
