package jshdc.bean;

/**
 * Created by yinghuihong on 16/1/26.
 */
public class User {
    public String userToken;
    public String userId;
    public String userName;
    public String portrait;

    @Override
    public String toString() {
        return "User{" +
                "userToken='" + userToken + '\'' +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", portrait='" + portrait + '\'' +
                '}';
    }
}
