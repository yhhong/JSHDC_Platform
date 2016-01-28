package jshdc.bean;

/**
 * 视频
 * Created by yinghuihong on 16/1/11.
 */
public class Video {
    public String id;
    public String playId;
    public String name;
    public String poster;
    public String director;
    public String actors;
    public String description;
    public String score;
    public String showTime;
    public String playCount;
    public String time;

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", playId='" + playId + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", score='" + score + '\'' +
                ", showTime='" + showTime + '\'' +
                ", playCount='" + playCount + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
