package jshdc.bean.response.ott;

import java.util.List;

/**
 * 电视剧
 * Created by yinghuihong on 16/1/11.
 */
public class Teleplay {
    public String id;
    public String name;
    public String poster;
    public String director;
    public String actors;
    public String description;
    public String score;
    public String showTime;
    public String playCount;
    public String total;
    public String updateCount;
    public List<Video> videos;
    public boolean collected;

    public Teleplay(String id, String name, String poster, String director, String actors, String description, String score,
                    String showTime, String playCount, String total, String updateCount, List<Video> videos, boolean collected) {
        this.id = id;
        this.name = name;
        this.poster = poster;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.score = score;
        this.showTime = showTime;
        this.playCount = playCount;
        this.total = total;
        this.updateCount = updateCount;
        this.videos = videos;
        this.collected = collected;
    }

    @Override
    public String toString() {
        return "Teleplay{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", description='" + description + '\'' +
                ", score='" + score + '\'' +
                ", showTime='" + showTime + '\'' +
                ", playCount='" + playCount + '\'' +
                ", total='" + total + '\'' +
                ", updateCount='" + updateCount + '\'' +
                ", videos=" + videos +
                ", collected=" + collected +
                '}';
    }
}
