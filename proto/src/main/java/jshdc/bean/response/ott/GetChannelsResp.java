package jshdc.bean.response.ott;

import jshdc.bean.Channel;

import java.util.List;

/**
 * 获取频道列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetChannelsResp {

    public int result;
    public String message;
    public List<Channel> channels;

    @Override
    public String toString() {
        return "GetChannelsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", channels=" + channels +
                '}';
    }
}
