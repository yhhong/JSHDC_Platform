package jshdc.bean;

/**
 * Created by yinghuihong on 16/2/23.
 */
public class Record {
    public String id;
    public String contentType;
    public String contentTableId;
    public String record;
    public String contentName;
    public String argument1;
    public String argument2;
    public String argument3;
    public String argument4;
    public String argument5;

    public Record(String id, String contentType, String contentTableId, String record, String contentName,
                  String argument1, String argument2, String argument3, String argument4, String argument5) {
        this.id = id;
        this.contentType = contentType;
        this.contentTableId = contentTableId;
        this.record = record;
        this.contentName = contentName;
        this.argument1 = argument1;
        this.argument2 = argument2;
        this.argument3 = argument3;
        this.argument4 = argument4;
        this.argument5 = argument5;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", contentType='" + contentType + '\'' +
                ", contentTableId='" + contentTableId + '\'' +
                ", record='" + record + '\'' +
                ", contentName='" + contentName + '\'' +
                ", argument1='" + argument1 + '\'' +
                ", argument2='" + argument2 + '\'' +
                ", argument3='" + argument3 + '\'' +
                ", argument4='" + argument4 + '\'' +
                ", argument5='" + argument5 + '\'' +
                '}';
    }
}
