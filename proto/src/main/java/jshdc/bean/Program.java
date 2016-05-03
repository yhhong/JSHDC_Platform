package jshdc.bean;

/**
 * 节目
 * Created by yinghuihong on 16/1/11.
 */
public class Program {

    public String id;
    public String name;
    public String url;
    public String showTime;
    public long totalTime;
    /**
     * 回看=1,直播=2,预告=3
     */
    public String playType;
    public String description;
    /**
     * 所属频道ID
     */
    public String channelId;

    public Program(String id, String name, String url, String showTime, long totalTime, String playType, String description, String channelId) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.showTime = showTime;
        this.totalTime = totalTime;
        this.playType = playType;
        this.description = description;
        this.channelId = channelId;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", showTime='" + showTime + '\'' +
                ", totalTime=" + totalTime +
                ", playType='" + playType + '\'' +
                ", description='" + description + '\'' +
                ", channelId='" + channelId + '\'' +
                '}';
    }
}
