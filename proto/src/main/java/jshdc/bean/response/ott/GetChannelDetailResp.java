package jshdc.bean.response.ott;

import jshdc.bean.Channel;

/**
 * 获取频道详情
 * Created by yinghuihong on 16/1/11.
 */
public class GetChannelDetailResp {

    public int result;

    public String message;

    public Channel channel;

    @Override
    public String toString() {
        return "GetChannelDetailResp{" +
                "channel=" + channel +
                '}';
    }
}
