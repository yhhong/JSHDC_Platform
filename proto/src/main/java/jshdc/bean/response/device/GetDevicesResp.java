package jshdc.bean.response.device;

import java.util.List;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class GetDevicesResp {

    public int result;
    public String message;
    public List<Device> devices;

    @Override
    public String toString() {
        return "GetDevicesResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", devices=" + devices +
                '}';
    }
}
