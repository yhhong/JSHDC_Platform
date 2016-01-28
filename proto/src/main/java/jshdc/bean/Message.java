package jshdc.bean;

/**
 * 运营消息
 * Created by yinghuihong on 16/1/8.
 */
public class Message {
    public String id;
    public String userId;
    public String avatar;
    public String name;
    public String content;

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
