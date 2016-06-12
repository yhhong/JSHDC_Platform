package jshdc.bean.response.system;

import java.util.List;

/**
 * Created by yinghuihong on 16/1/11.
 */
public class GetFloorsResp {

    public int result;
    public String message;
    public List<Floor> floors;
    public long lastModifyTime;

    @Override
    public String toString() {
        return "GetFloorsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", floors=" + floors +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}
