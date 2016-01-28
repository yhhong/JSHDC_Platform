package jshdc.bean.response.common;

/**
 * Created by yinghuihong on 16/1/26.
 */
public class SsoResp {

    public int result;
    public String message;

    @Override
    public String toString() {
        return "SsoResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
