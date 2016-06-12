package jshdc.bean.response.ott;

/**
 * 点播推荐,返回视频or电视剧的部分元素
 * Created by yinghuihong on 16/5/16.
 */
public class VodRecommend {

    public String id;
    public String videoId;
    public String teleplayId;
    public String name;
    public String poster;
    public String director;
    public String actors;
    public String description;
    public String score;
    public long showTime;
    public String playCount;

    public VodRecommend(String id, String videoId, String teleplayId, String name, String poster, String director,
                        String actors, String description, String score, long showTime, String playCount) {
        this.id = id;
        this.videoId = videoId;
        this.teleplayId = teleplayId;
        this.name = name;
        this.poster = poster;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.score = score;
        this.showTime = showTime;
        this.playCount = playCount;
    }

    @Override
    public String toString() {
        return "VodRecommend{" +
                "id='" + id + '\'' +
                ", videoId='" + videoId + '\'' +
                ", teleplayId='" + teleplayId + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", score='" + score + '\'' +
                ", showTime=" + showTime +
                ", playCount='" + playCount + '\'' +
                '}';
    }
}
