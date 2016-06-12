package jshdc.bean.response.device;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class DeleteDeviceResp {

    public int result;
    public String message;

    @Override
    public String toString() {
        return "DeleteDeviceResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
