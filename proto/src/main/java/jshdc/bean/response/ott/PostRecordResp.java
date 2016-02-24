package jshdc.bean.response.ott;

/**
 * 记录新增
 * Created by yinghuihong on 16/1/11.
 */
public class PostRecordResp {
    public int result;
    public String message;

    @Override
    public String toString() {
        return "PostRecordResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
