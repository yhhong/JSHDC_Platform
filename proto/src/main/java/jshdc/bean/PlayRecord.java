package jshdc.bean;

/**
 * Created by yinghuihong on 16/2/23.
 */
public class PlayRecord {
    public String id;
    public String videoId;
    public String teleplayId;
    public long breakPoint;
    public String name;
    public String poster;

    public PlayRecord(String id, String videoId, String teleplayId, long breakPoint, String name, String poster) {
        this.id = id;
        this.videoId = videoId;
        this.teleplayId = teleplayId;
        this.breakPoint = breakPoint;
        this.name = name;
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "PlayRecord{" +
                "id=" + id +
                ", videoId='" + videoId + '\'' +
                ", breakPoint=" + breakPoint +
                ", teleplayId='" + teleplayId + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}
