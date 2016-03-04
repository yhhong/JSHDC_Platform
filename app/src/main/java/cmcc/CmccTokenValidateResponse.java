package cmcc;

/**
 * 统一认证凭证验证响应
 * Created by yinghuihong on 16/3/3.
 */
public class CmccTokenValidateResponse {

    public Body body;

    public Header header;

    public CmccTokenValidateResponse(Body body, Header header) {
        this.body = body;
        this.header = header;
    }

    @Override
    public String toString() {
        return "CmccTokenValidateResponse{" +
                "body=" + body +
                ", header=" + header +
                '}';
    }

    public class Body {
        public String resultstring;
        /**
         * 统一认证平台认证用户的时间
         */
        public String authtime;
        /**
         * 认证方式，取值参见《统一认证开发指南》附录H
         */
        public String authtype;
        /**
         * 业务平台为该用户的最近一次报活时间
         */
        public String lastactivetime;
        /**
         * 登录使用的用户标识：
         * 0：手机号码
         * 1：邮箱
         */
        public String loginidtype;
        /**
         * 手机号码
         */
        public String msisdn;
        /**
         * 用户统一账号的系统标识
         */
        public String passid;
        /**
         * 用户在本业务平台的账号是否已经关联到统一账号，若已关联，与统一账号中手机/邮箱相同的业务账号不能再登录
         * 0：已经关联
         * 1：未关联
         */
        public String relateToAndPassport;
        /**
         * 统一认证平台为用户生成的单点登录凭证，在新版客户端场景下为B-TID
         */
        public String usessionid;

        @Override
        public String toString() {
            return "Body{" +
                    "resultstring='" + resultstring + '\'' +
                    ", authtime='" + authtime + '\'' +
                    ", authtype='" + authtype + '\'' +
                    ", lastactivetime='" + lastactivetime + '\'' +
                    ", loginidtype='" + loginidtype + '\'' +
                    ", msisdn='" + msisdn + '\'' +
                    ", passid='" + passid + '\'' +
                    ", relateToAndPassport='" + relateToAndPassport + '\'' +
                    ", usessionid='" + usessionid + '\'' +
                    '}';
        }
    }

    public class Header {
        public String inresponseto;
        public String resultcode;
        public String systemtime;
        public String version;

        @Override
        public String toString() {
            return "Header{" +
                    "inresponseto='" + inresponseto + '\'' +
                    ", resultcode='" + resultcode + '\'' +
                    ", systemtime='" + systemtime + '\'' +
                    ", version='" + version + '\'' +
                    '}';
        }
    }
}
