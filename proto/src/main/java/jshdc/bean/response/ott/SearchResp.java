package jshdc.bean.response.ott;

import jshdc.bean.Content;

import java.util.List;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class SearchResp {

    public int result;
    public String message;
    public List<Content> contents;

    @Override
    public String toString() {
        return "SearchResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", contents=" + contents +
                '}';
    }
}
