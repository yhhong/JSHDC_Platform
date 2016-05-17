package jshdc.bean.response.ott;

import java.util.List;

/**
 * 获取播放记录列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodPlayRecordsResp {
    public int result;
    public String message;
    public List<VodPlayRecord> vodPlayRecords;

    @Override
    public String toString() {
        return "GetVodPlayRecordsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", vodPlayRecords=" + vodPlayRecords +
                '}';
    }
}
