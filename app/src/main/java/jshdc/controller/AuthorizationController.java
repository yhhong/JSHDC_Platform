package jshdc.controller;

import cmcc.BusinessException;
import cmcc.CmccRequest;
import cmcc.CmccTokenValidateResponse;
import jshdc.bean.response.common.SsoResp;
import jshdc.bean.response.common.UserLoginResp;
import jshdc.bean.response.common.UserLogoutResp;
import jshdc.bean.response.common.UserTokenRefreshResp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 授权相关
 * Created by yinghuihong on 16/1/11.
 */
@RestController
public class AuthorizationController {

    /**
     * 用户登录
     *
     * @param userName   登录用户名
     * @param password   登录密码
     * @param clientType 客户端类型:1机顶盒客户端,2手机客户端
     * @param authType   认证类型:1用户名密码认证,2全网统一认证
     * @param sn         魔百和SN
     * @param token      全网统一认证
     * @return
     */
    @RequestMapping(value = "/hdc/userLogin")
    public UserLoginResp tokenValidate(@RequestParam(required = false) String userName,
                                       @RequestParam(required = false) String password,
                                       @RequestParam String clientType,
                                       @RequestParam String authType,
                                       @RequestParam(required = false) String sn,
                                       @RequestParam(required = false) String token) {

        UserLoginResp resp = new UserLoginResp();
        try {
            CmccTokenValidateResponse cmccTokenValidateResponse = CmccRequest.checkToken(token);
            CmccTokenValidateResponse.Header header = cmccTokenValidateResponse.header;
            CmccTokenValidateResponse.Body body = cmccTokenValidateResponse.body;
            // TODO save user info and token into db

            //返回给客户端
//            User user = new User();
//            user.id = body.passid;// 采用passId
//            user.portrait = Pic.PIC2;
//            user.phone = body.msisdn;
//            user.authtime = body.authtime;
//            user.authtype = body.authtype;
//            user.lastactivetime = body.lastactivetime;
//            user.loginidtype = body.loginidtype;
//            user.passid = body.passid;
//            user.relateToAndPassport = body.relateToAndPassport;
//            user.usessionid = body.usessionid;

            if (header.resultcode.equals("103000")) {
                resp.userToken = "user" + token;
                resp.resultCode = 0;
                resp.resultDesc = "success";
            } else {
                resp.resultCode = Integer.parseInt(header.resultcode);
                resp.resultDesc = "token verify fail";
            }
        } catch (BusinessException e) {
            resp.resultCode = e.getCode();
            resp.resultDesc = e.getMessage();
        }
        System.out.println(resp);
        return resp;
    }

    /**
     * 用户令牌刷新
     *
     * @return
     */
    @RequestMapping(value = "/hdc/userTokenRefresh")
    public UserTokenRefreshResp userTokenRefresh(@RequestParam String userName,
                                                 @RequestParam String userToken) {
        UserTokenRefreshResp resp = new UserTokenRefreshResp();
        resp.resultCode = 0;
        resp.resultDesc = "success";
        System.out.println(resp);
        return resp;
    }

    /**
     * 用户登出
     *
     * @param userName  登录用户名(手机号)
     * @param authType  认证类型:1用户名密码认证,2全网统一认证
     * @param token     全网统一认证凭证
     * @param userToken 家开平台凭证
     * @return
     */
    @RequestMapping(value = "/hdc/userLogout")
    public UserLogoutResp userLogout(@RequestParam String userName,
                                     @RequestParam String authType,
                                     @RequestParam(required = false) String token,
                                     @RequestParam String userToken) {
        UserLogoutResp resp = new UserLogoutResp();
        resp.resultCode = 0;
        resp.resultDesc = "success";
        System.out.println(resp);
        return resp;
    }


    /**
     * 单点登录认证（供华为EPG/CDN平台调用）
     *
     * @param cmtokenid 家开平台TOKEN
     * @return
     */
    @RequestMapping(value = "/hdc/svc/sso/loginUserInfo/cmtokenid/{cmtokenid}")
    public SsoResp sso(@PathVariable String cmtokenid) {
        SsoResp resp = new SsoResp();
        resp.result = 0;
        resp.message = "success, your cmtokenid is " + cmtokenid;
        System.out.println(resp);
        return resp;
    }

}
