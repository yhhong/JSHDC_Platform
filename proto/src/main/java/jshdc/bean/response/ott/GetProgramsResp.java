package jshdc.bean.response.ott;

import jshdc.bean.Program;

import java.util.List;

/**
 * 获取节目列表
 * Created by yinghuihong on 16/1/11.
 */
public class GetProgramsResp {

    public int result;
    public String message;
    public List<Program> programs;

    @Override
    public String toString() {
        return "GetProgramsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", programs=" + programs +
                '}';
    }
}
