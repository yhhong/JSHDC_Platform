package jshdc.bean;

/**
 * 频道
 * Created by yinghuihong on 16/1/11.
 */
public class Channel {

    public String id;
    public String name;
    public String url;
    public String description;

    public Channel(String id, String name, String url, String description) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
