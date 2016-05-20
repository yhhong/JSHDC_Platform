package jshdc.bean.response.ott;

/**
 * 删除点播播放记录
 * Created by yinghuihong on 16/5/20.
 */
public class DeleteVodPlayRecordResp {

    public int result;
    public String message;

    @Override
    public String toString() {
        return "DeleteVodPlayRecordResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
