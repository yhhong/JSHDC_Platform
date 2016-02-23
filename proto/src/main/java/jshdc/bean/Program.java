package jshdc.bean;

/**
 * 节目
 * Created by yinghuihong on 16/1/11.
 */
public class Program {

    public long id;
    public String name;
    public String showTime;
    /**
     * 直播/回看
     */
    public String playType;
    public String description;

    public Program(long id, String name, String showTime, String playType, String description) {
        this.id = id;
        this.name = name;
        this.showTime = showTime;
        this.playType = playType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", showTime='" + showTime + '\'' +
                ", playType='" + playType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
