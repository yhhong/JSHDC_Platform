package jshdc.bean;

import java.util.List;

/**
 * 楼层
 * Created by yinghuihong on 16/1/8.
 */
public class Floor {
    public String id;
    public String name;
    public String order;
    public String displayType;
    public String view;
    public String argument;
    public String element1;
    public String element2;
    public List<Content> contents;
    public List<Message> messages;

    @Override
    public String toString() {
        return "Floor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", order='" + order + '\'' +
                ", displayType='" + displayType + '\'' +
                ", view='" + view + '\'' +
                ", argument='" + argument + '\'' +
                ", element1='" + element1 + '\'' +
                ", element2='" + element2 + '\'' +
                ", contents=" + contents +
                ", messages=" + messages +
                '}';
    }
}
