package jshdc.controller;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by yinghuihong on 16/1/11.
 */
@RestController
public class VoipController {

    /**
     * 获取家庭成员列表
     */
    @RequestMapping(value = "/getFamilyMemberList", method = RequestMethod.POST)
    public Boolean getFamilyMemberList(@RequestBody String json) {
        Map<String, Object> map = new GsonJsonParser().parseMap(json);
        //TODO verify token
        // {"rst":"","message":"","data":""}
        return true;
    }

    /**
     * 修改成员信息
     */
    @RequestMapping(value = "/modifyMemberInfo", method = RequestMethod.POST)
    public Boolean modifyMemberInfo(@RequestBody String json) {
        Map<String, Object> map = new GsonJsonParser().parseMap(json);
        //TODO verify token
        // {"rst":"","message":"","data":""}
        return true;
    }
}
