package jshdc.bean;

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
                '}';
    }
}
