package jshdc.bean.response.ott;

/**
 * 获取电视剧详情
 * Created by yinghuihong on 16/1/11.
 */
public class GetTeleplayDetailResp {

    public int result;
    public String message;
    public Teleplay teleplay;

    @Override
    public String toString() {
        return "GetTeleplayDetailResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", teleplay=" + teleplay +
                '}';
    }
}
