package jshdc.bean.response.ott;

/**
 * 删除收藏内容
 * Created by yinghuihong on 16/1/11.
 */
public class DeleteCollectVideoResp {
    public int result;
    public String message;

    @Override
    public String toString() {
        return "DeleteCollectVideoResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}
