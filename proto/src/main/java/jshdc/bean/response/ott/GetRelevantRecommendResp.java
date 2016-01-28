package jshdc.bean.response.ott;

import jshdc.bean.Content;

import java.util.List;

/**
 * 获取关联推荐
 * Created by yinghuihong on 16/1/11.
 */
public class GetRelevantRecommendResp {

    public int result;
    public String message;
    public List<Content> contents;

    @Override
    public String toString() {
        return "GetRelevantRecommendResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", contents=" + contents +
                '}';
    }
}
