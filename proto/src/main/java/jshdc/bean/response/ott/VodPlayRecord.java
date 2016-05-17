package jshdc.bean.response.ott;

/**
 * 点播播放记录
 * Created by yinghuihong on 16/2/23.
 */
public class VodPlayRecord {
    public String id;
    public String videoId;
    public String teleplayId;
    public String playedTime;
    public String name;
    public String poster;
    public String totalTime;
    public long generateTime;

    public VodPlayRecord(String id, String videoId, String teleplayId, String playedTime, String name, String poster,
                         String totalTime, long generateTime) {
        this.id = id;
        this.videoId = videoId;
        this.teleplayId = teleplayId;
        this.playedTime = playedTime;
        this.name = name;
        this.poster = poster;
        this.totalTime = totalTime;
        this.generateTime = generateTime;
    }

    @Override
    public String toString() {
        return "VodPlayRecord{" +
                "id='" + id + '\'' +
                ", videoId='" + videoId + '\'' +
                ", teleplayId='" + teleplayId + '\'' +
                ", playedTime='" + playedTime + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", totalTime='" + totalTime + '\'' +
                ", generateTime='" + generateTime + '\'' +
                '}';
    }
}
