package jshdc.controller;

import com.google.gson.Gson;
import jshdc.bean.response.device.DeleteDeviceResp;
import jshdc.bean.response.device.Device;
import jshdc.bean.response.device.GetDevicesResp;
import jshdc.bean.response.device.PostDeviceResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 多屏互动模块
 * Created by yinghuihong on 16/5/16.
 */
@RestController
public class DeviceController {

    @RequestMapping(value = "/postDevice")
    public PostDeviceResp postDevice(@RequestParam String userToken,
                                     @RequestParam String device) {
        System.out.println(device);
        Device deviceInfo = new Gson().fromJson(device, Device.class);
        System.out.println(deviceInfo);

        PostDeviceResp resp = new PostDeviceResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "/deleteDevice")
    public DeleteDeviceResp deleteDevice(@RequestParam String userToken,
                                         @RequestParam String udn) {
        DeleteDeviceResp resp = new DeleteDeviceResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

    @RequestMapping(value = "getDevices")
    public GetDevicesResp getDevices(@RequestParam String userToken,
                                     @RequestParam(required = false, defaultValue = "0") int start,
                                     @RequestParam(required = false, defaultValue = "20") int limit) {
        GetDevicesResp resp = new GetDevicesResp();
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("deviceName1", "modelName1", "uuid:xxxxxxxxx1", System.currentTimeMillis() - 6 * 60 * 60 * 1000));
        devices.add(new Device("deviceName2", "modelName2", "uuid:xxxxxxxxx2", System.currentTimeMillis() - 3 * 60 * 60 * 1000));
        devices.add(new Device("deviceName2", "modelName2", "uuid:xxxxxxxxx3", System.currentTimeMillis() - 14 * 60 * 60 * 1000));
        resp.devices = devices;
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }
}
