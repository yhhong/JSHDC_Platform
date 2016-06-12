//package jshdc.bean.response.common;
//
///**
// * Created by yinghuihong on 16/1/26.
// */
//public class User {
//    public String id;
//    public String name;
//    public String portrait;
//    /**
//     * 统一认证平台认证用户的时间
//     */
//    public String authtime;
//    /**
//     * 认证方式，取值参见《统一认证开发指南》附录H
//     */
//    public String authtype;
//    /**
//     * 业务平台为该用户的最近一次报活时间
//     */
//    public String lastactivetime;
//    /**
//     * 登录使用的用户标识：
//     * 0：手机号码
//     * 1：邮箱
//     */
//    public String loginidtype;
//    /**
//     * 手机号码
//     */
//    public String phone;
//    /**
//     * 用户统一账号的系统标识
//     */
//    public String passid;
//    /**
//     * 用户在本业务平台的账号是否已经关联到统一账号，若已关联，与统一账号中手机/邮箱相同的业务账号不能再登录
//     * 0：已经关联
//     * 1：未关联
//     */
//    public String relateToAndPassport;
//    /**
//     * 统一认证平台为用户生成的单点登录凭证，在新版客户端场景下为B-TID
//     */
//    public String usessionid;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", portrait='" + portrait + '\'' +
//                ", authtime='" + authtime + '\'' +
//                ", authtype='" + authtype + '\'' +
//                ", lastactivetime='" + lastactivetime + '\'' +
//                ", loginidtype='" + loginidtype + '\'' +
//                ", phone='" + phone + '\'' +
//                ", passid='" + passid + '\'' +
//                ", relateToAndPassport='" + relateToAndPassport + '\'' +
//                ", usessionid='" + usessionid + '\'' +
//                '}';
//    }
//}
