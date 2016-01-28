package jshdc.bean.response.common;

import jshdc.bean.User;

/**
 * 动态短信登陆
 * Created by yinghuihong on 16/1/26.
 */
public class LoginBySmsCaptchaResp {

    public int result;
    public String message;
    public User user;

    @Override
    public String toString() {
        return "LoginBySmsCaptchaResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", user=" + user +
                '}';
    }
}
