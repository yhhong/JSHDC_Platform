package jshdc.controller;

import jshdc.bean.User;
import jshdc.bean.response.common.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yinghuihong on 16/1/11.
 */
@RestController
public class CommonController {


    /**
     * 短信验证码获取
     */
    @RequestMapping(value = "/getLoginSmsCaptcha")
    public GetLoginSmsCaptchaResp getLoginSmsCaptcha(@RequestParam String phone) {
        //TODO 生成captcha并通过短信下发
        GetLoginSmsCaptchaResp resp = new GetLoginSmsCaptchaResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 短信验证码登陆
     */
    @RequestMapping(value = "/loginBySmsCaptcha")
    public LoginBySmsCaptchaResp loginBySmsCaptcha(@RequestParam String phone, @RequestParam String captcha) {
        // TODO 1证有效性 2查询用户信息 3生成userToken返回

        LoginBySmsCaptchaResp resp = new LoginBySmsCaptchaResp();

        User user = new User();
        user.userId = "userId_1";
        user.userName = "userName_1";
        user.portrait = Pic.PIC1;
        user.userToken = "user_token_1";

        resp.user = user;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 全网统一认证Token登陆
     */
    @RequestMapping(value = "/loginByUnifyToken")
    public LoginByUnifyTokenResp loginByUnityToken(@RequestParam String unifyToken) {
        //TODO verify unifyToken through Unity platform and return what info? phone?
        //TODO 通过统一认证平台认证后返回的phone到家开平台数据库中查询该用户信息,得到userId

        LoginByUnifyTokenResp resp = new LoginByUnifyTokenResp();

        User user = new User();
        user.userId = "userId_2";
        user.userName = "userName_2";
        user.portrait = Pic.PIC2;
        user.userToken = "user_token_2";

        resp.user = user;
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 单点登录认证（供华为EPG/CDN平台调用）
     */
    @RequestMapping(value = "/sso")
    public SsoResp sso(@RequestParam String userToken) {
        // TODO verify whether the userToken is available
        SsoResp resp = new SsoResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }

    /**
     * 密码修改(暂不需要)
     */
    @RequestMapping(value = "/modifyPassword")
    public ModifyPasswordResp modifyPassword(@RequestParam String phone, @RequestParam String captcha, @RequestParam String password) {
        //TODO verify and modify
        ModifyPasswordResp resp = new ModifyPasswordResp();
        resp.result = 0;
        resp.message = "success";
        return resp;
    }
}
