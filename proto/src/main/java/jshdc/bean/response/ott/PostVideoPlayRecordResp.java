package jshdc.bean.response.ott;

/**
 * 播放记录新增
 * Created by yinghuihong on 16/1/11.
 */
public class PostVideoPlayRecordResp {
    public int result;
    public String message;

    @Override
    public String toString() {
        return "PostVideoPlayRecordResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
