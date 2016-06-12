package jshdc.bean.response.ott;

import java.util.List;

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
    public List<String> resolutions;
    public boolean collected;


    public Video(String id, String playId, String name, String poster, String director, String actors, String description,
                 String score, String showTime, String playCount, String time, List<String> resolutions, boolean collected) {
        this.id = id;
        this.playId = playId;
        this.name = name;
        this.poster = poster;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.score = score;
        this.showTime = showTime;
        this.playCount = playCount;
        this.time = time;
        this.resolutions = resolutions;
        this.collected = collected;
    }

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
                ", resolutions=" + resolutions +
                ", collected=" + collected +
                '}';
    }
}
