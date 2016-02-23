package jshdc.bean;

/**
 * 频道标签
 * Created by yinghuihong on 16/1/11.
 */
public class ChannelTag {
    public long id;
    public String name;

    public ChannelTag(long id, String name) {
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
