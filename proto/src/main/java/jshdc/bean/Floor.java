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
    /**
     * 采用模板
     */
    public String displayType;
    /**
     * 点击后跳转页面的类型
     */
    public String view;
    public String argument;
    public String element1;
    public String element2;
    public List<Content> contents;
    public List<Message> messages;

    /**
     *
     * @param id
     * @param name
     * @param order
     * @param displayType 采用模板
     * @param view 点击后跳转页面的类型
     * @param argument
     * @param element1
     * @param element2
     * @param contents
     * @param messages
     */
    public Floor(String id, String name, String order, String displayType, String view, String argument, String element1, String element2, List<Content> contents, List<Message> messages) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.displayType = displayType;
        this.view = view;
        this.argument = argument;
        this.element1 = element1;
        this.element2 = element2;
        this.contents = contents;
        this.messages = messages;
    }

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
