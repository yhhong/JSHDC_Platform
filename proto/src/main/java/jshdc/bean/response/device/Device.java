package jshdc.bean.response.device;

/**
 * 设备
 * Created by yinghuihong on 16/5/16.
 */
public class Device {

    public String deviceName;
    public String modelName;
    public String udn;
    public long lastConnectTime;

    public Device() {
    }

    public Device(String deviceName, String modelName, String udn, long lastConnectTime) {
        this.deviceName = deviceName;
        this.modelName = modelName;
        this.udn = udn;
        this.lastConnectTime = lastConnectTime;
    }

    @Override
    public String toString() {
        return "Device{" +
                ", deviceName='" + deviceName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", udn='" + udn + '\'' +
                ", lastConnectTime='" + lastConnectTime + '\'' +
                '}';
    }
}
