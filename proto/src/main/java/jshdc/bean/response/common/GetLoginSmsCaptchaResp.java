package jshdc.bean.response.common;

/**
 * Created by yinghuihong on 16/1/26.
 */
public class GetLoginSmsCaptchaResp {
    public int result;
    public String message;

    @Override
    public String toString() {
        return "GetLoginSmsCaptchaResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
