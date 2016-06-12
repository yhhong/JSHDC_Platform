package jshdc.bean.response.system;

/**
 * 内容
 * Created by yinghuihong on 16/1/8.
 */
public class Content {
    public String id;
    public String name;
    public String poster;
    public String contentType;
    public String tableId;
    public String element1;
    public String element2;
    public String element3;
    public String element4;
    public String element5;

    public Content(String id, String name, String poster, String contentType, String tableId, String element1,
                   String element2, String element3, String element4, String element5) {
        this.id = id;
        this.name = name;
        this.poster = poster;
        this.contentType = contentType;
        this.tableId = tableId;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
        this.element5 = element5;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", contentType='" + contentType + '\'' +
                ", tableId='" + tableId + '\'' +
                ", element1='" + element1 + '\'' +
                ", element2='" + element2 + '\'' +
                ", element3='" + element3 + '\'' +
                ", element4='" + element4 + '\'' +
                ", element5='" + element5 + '\'' +
                '}';
    }
}
