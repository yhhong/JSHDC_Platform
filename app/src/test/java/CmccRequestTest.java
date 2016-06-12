import cmcc.BusinessException;
import cmcc.CmccRequest;
import cmcc.CmccTokenValidateResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yinghuihong on 16/3/4.
 */
public class CmccRequestTest {


    @Test
    public void testCheckToken() {
        try {
            CmccTokenValidateResponse response = CmccRequest.checkToken("8484010001320200344E6A5133525455774D6A6735526B5A474D544D314E445A4640687474703A2F2F3231312E3133362E31302E3133313A383038302F03000401D9EE96040006303031303230FF002092D05380F5BCF618E647ABF05F7D1F05A757B91801FBE16B5D89B1DF9E95C5C4");
            if (response.header.resultcode.equals("103000")) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } catch (BusinessException e) {
            e.printStackTrace();
            Assert.assertTrue(false);
        }
    }

    @Test
    public void testDateUtil() {
//        long showTime = 20160420190000l;
//        System.out.println(showTime);

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date(System.currentTimeMillis()));

//        System.out.println(calendar.toString());

//        System.out.println(DateUtil.getStringToday());
//
//        System.out.println(DateUtil.strToDate("20160425180000"));

//        CalendarUtil.today();

    }

}
