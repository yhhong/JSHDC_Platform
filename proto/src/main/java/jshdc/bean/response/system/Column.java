package jshdc.bean.response.system;

/**
 * 栏目
 * Created by yinghuihong on 16/1/8.
 */
public class Column {
    public String id;
    public String name;
    public int status;
    public String pId;

    public Column(String id, String name, String pId) {
        this.id = id;
        this.name = name;
        this.pId = pId;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", pId='" + pId + '\'' +
                '}';
    }
}
