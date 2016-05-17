package jshdc.bean.response.ott;

/**
 * 点播收藏
 * Created by yinghuihong on 16/2/24.
 */
public class VodCollect {
    public String id;
    public String videoId;
    public String teleplayId;
    public String name;
    public String poster;
    /**
     * 视频时长
     */
    public long totalTime;
    /**
     * 电视剧剧集
     */
    public String totalCount;
    public String updateCount;
    public long generateTime;

    public VodCollect(String id, String videoId, String teleplayId, String name, String poster, long totalTime,
                      String totalCount, String updateCount, long generateTime) {
        this.id = id;
        this.videoId = videoId;
        this.teleplayId = teleplayId;
        this.name = name;
        this.poster = poster;
        this.totalTime = totalTime;
        this.totalCount = totalCount;
        this.updateCount = updateCount;
        this.generateTime = generateTime;
    }

    @Override
    public String toString() {
        return "VodCollect{" +
                "id='" + id + '\'' +
                ", videoId='" + videoId + '\'' +
                ", teleplayId='" + teleplayId + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", totalTime='" + totalTime + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", updateCount='" + updateCount + '\'' +
                ", generateTime='" + generateTime + '\'' +
                '}';
    }
}
