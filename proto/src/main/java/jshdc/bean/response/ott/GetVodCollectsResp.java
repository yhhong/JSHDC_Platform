package jshdc.bean.response.ott;

import java.util.List;

/**
 * 获取收藏列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetVodCollectsResp {
    public int result;
    public String message;
    public List<VodCollect> vodCollects;

    @Override
    public String toString() {
        return "GetVodCollectsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", vodCollects=" + vodCollects +
                '}';
    }
}
