package jshdc.bean.response.ott;

import jshdc.bean.Collect;
import jshdc.bean.Content;
import jshdc.bean.Video;

import java.util.List;

/**
 * 获取收藏列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetCollectsResp {
    public int result;
    public String message;
    public List<Collect> collects;

    @Override
    public String toString() {
        return "GetCollectsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", collects=" + collects +
                '}';
    }
}
