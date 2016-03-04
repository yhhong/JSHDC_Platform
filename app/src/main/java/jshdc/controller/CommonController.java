package jshdc.controller;

import cmcc.BusinessException;
import cmcc.CmccRequest;
import cmcc.CmccTokenValidateResponse;
import jshdc.bean.User;
import jshdc.bean.response.common.SsoResp;
import jshdc.bean.response.common.TokenValidateResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yinghuihong on 16/1/11.
 */
@RestController
public class CommonController {

    /**
     * 全网统一认证Token登陆
     */
    @RequestMapping(value = "/tokenValidate")
    public TokenValidateResp tokenValidate(@RequestParam String token) {

        TokenValidateResp resp = new TokenValidateResp();
        try {
            CmccTokenValidateResponse cmccTokenValidateResponse = CmccRequest.checkToken(token);
            CmccTokenValidateResponse.Body body = cmccTokenValidateResponse.body;
            // TODO save user info and token into db

            //返回给客户端
            User user = new User();
            user.id = body.passid;// 采用passId
            user.portrait = Pic.PIC2;
            user.phone = body.msisdn;
            user.authtime = body.authtime;
            user.authtype = body.authtype;
            user.lastactivetime = body.lastactivetime;
            user.loginidtype = body.loginidtype;
            user.passid = body.passid;
            user.relateToAndPassport = body.relateToAndPassport;
            user.usessionid = body.usessionid;

            resp.user = user;
            resp.result = 0;
            resp.message = "success";
        } catch (BusinessException e) {
            resp.result = e.getCode();
            resp.message = e.getMessage();
        }
        System.out.println(resp);
        return resp;
    }

    /**
     * 单点登录认证（供华为EPG/CDN平台调用）
     */
    @RequestMapping(value = "/sso")
    public SsoResp sso(@RequestParam String token) {
        // TODO verify whether the userToken is available
        SsoResp resp = new SsoResp();
        resp.result = 0;
        resp.message = "success";
        System.out.println(resp);
        return resp;
    }

}
