package jshdc.bean;

/**
 * 内容
 * Created by yinghuihong on 16/1/8.
 */
public class Content {
    public String id;
    public String name;
    public String poster;
    public String type;
    public String tableId;
    public String view;
    public String argument;
    public String element1;
    public String element2;

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", type='" + type + '\'' +
                ", tableId='" + tableId + '\'' +
                ", view='" + view + '\'' +
                ", argument='" + argument + '\'' +
                ", element1='" + element1 + '\'' +
                ", element2='" + element2 + '\'' +
                '}';
    }
}
