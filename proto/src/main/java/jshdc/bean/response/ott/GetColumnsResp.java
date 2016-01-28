package jshdc.bean.response.ott;

import jshdc.bean.Column;

import java.util.List;

/**
 * 获取栏目列表
 * Created by yinghuihong on 16/1/8.
 */
public class GetColumnsResp {
    public int result;
    public String message;
    public List<Column> columns;

    @Override
    public String toString() {
        return "GetColumnsResp{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", columns=" + columns +
                '}';
    }
}
