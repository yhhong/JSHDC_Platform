package jshdc.bean.response.ott;

import jshdc.bean.Program;

/**
 * 获取节目详情
 * Created by yinghuihong on 16/1/11.
 */
public class GetProgramDetailResp {

    public int result;
    public String message;
    public Program program;

    @Override
    public String toString() {
        return "GetProgramDetailResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", program=" + program +
                '}';
    }
}
