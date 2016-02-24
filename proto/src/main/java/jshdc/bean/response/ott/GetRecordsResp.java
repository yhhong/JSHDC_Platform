package jshdc.bean.response.ott;

import jshdc.bean.Record;

import java.util.List;

/**
 * 获取播放记录列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetRecordsResp {
    public int result;
    public String message;
    public List<Record> records;

    @Override
    public String toString() {
        return "GetRecordsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", records=" + records +
                '}';
    }
}
