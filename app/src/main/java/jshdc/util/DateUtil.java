package jshdc.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yinghuihong on 16/4/27.
 */
public class DateUtil {

    /**
     * long to string
     *
     * @return 字符串 yyyyMMdd HHmmss
     */
    public static String longToString(long timeMills) {
        Date currentTime = new Date(timeMills);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * long to string
     *
     * @return 字符串 HH:mm
     */
    public static String longToString2(long timeMills) {
        Date currentTime = new Date(timeMills);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * long to string
     *
     * @return 字符串 HH
     */
    public static String longToString3(long timeMills) {
        Date currentTime = new Date(timeMills);
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 将短时间格式字符串转换为时间 yyyyMMdd HHmmss
     *
     * @param strDate
     * @return
     */
    public static Date stringToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * long 转 String
     *
     * @return 返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String print(long timeMillis) {
        Date date = new Date(timeMillis);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }
}
