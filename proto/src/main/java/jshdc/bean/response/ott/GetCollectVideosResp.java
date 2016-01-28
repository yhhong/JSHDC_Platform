package jshdc.bean.response.ott;

import jshdc.bean.Video;

import java.util.List;

/**
 * 获取收藏列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetCollectVideosResp {
    public int result;
    public String message;
    public List<Video> videos;

    @Override
    public String toString() {
        return "GetCollectVideosResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", videos=" + videos +
                '}';
    }
}
