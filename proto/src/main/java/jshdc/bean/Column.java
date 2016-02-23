package jshdc.bean;

/**
 * 栏目
 * Created by yinghuihong on 16/1/8.
 */
public class Column {
    public String id;
    public String name;
    public String status;

    public Column(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
