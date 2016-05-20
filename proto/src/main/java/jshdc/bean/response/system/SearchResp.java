package jshdc.bean.response.system;

import java.util.List;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class SearchResp {

    public int result;
    public String message;
    public List<Floor> floors;

    @Override
    public String toString() {
        return "SearchResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", floors=" + floors +
                '}';
    }
}
