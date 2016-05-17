package jshdc.util;

import org.junit.Test;

/**
 * Created by yinghuihong on 16/5/16.
 */
public class TimeUtilTest {

    @Test
    public void testConvertTimeMillis() {
        long timeMillis = TimeUtil.convertTimeMillis("01:10:10");
        System.out.println(timeMillis);
    }
}
