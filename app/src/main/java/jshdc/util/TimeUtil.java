package jshdc.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class TimeUtil {

    public static long convertTimeMillis(String time) {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date date = formatter.parse(time, pos);
        return date.getTime();
    }
}
