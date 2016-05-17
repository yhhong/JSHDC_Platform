package jshdc.bean.response.ott;

import java.util.List;

/**
 * 获取点播关联推荐
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodRecommendsResp {

    public int result;
    public String message;
    public List<VodRecommend> vodRecommends;

    @Override
    public String toString() {
        return "GetVodRecommendsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", vodRecommends=" + vodRecommends +
                '}';
    }
}
