package jshdc.bean;

/**
 * 栏目
 * Created by yinghuihong on 16/1/8.
 */
public class Column {
    public long id;
    public String name;
    public String status;

    public Column(long id, String name) {
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
