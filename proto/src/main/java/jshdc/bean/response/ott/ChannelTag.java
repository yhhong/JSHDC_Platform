package jshdc.bean.response.ott;

/**
 * 频道标签
 * Created by yinghuihong on 16/1/11.
 */
public class ChannelTag {
    public String id;
    public String name;

    public ChannelTag(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChannelTag{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
