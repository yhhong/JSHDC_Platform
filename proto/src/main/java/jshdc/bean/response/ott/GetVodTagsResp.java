package jshdc.bean.response.ott;

import jshdc.bean.VodTag;

import java.util.List;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodTagsResp {

    public int result;
    public String message;
    public List<VodTag> tags;

    @Override
    public String toString() {
        return "GetVodTagsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", tags=" + tags +
                '}';
    }
}
