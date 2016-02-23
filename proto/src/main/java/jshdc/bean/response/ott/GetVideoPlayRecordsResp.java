package jshdc.bean.response.ott;

import jshdc.bean.Content;
import jshdc.bean.PlayRecord;

import java.util.List;

/**
 * 获取播放记录列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetVideoPlayRecordsResp {
    public int result;
    public String message;
    public List<PlayRecord> playRecords;

    @Override
    public String toString() {
        return "GetVideoPlayRecordsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", playRecords=" + playRecords +
                '}';
    }
}
