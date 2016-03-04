package cmcc;

import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 统一认证平台请求类
 * Created by yinghuihong on 16/3/2.
 */
public class CmccRequest {

    private final static String SOURCE_ID = "001020";

    private final static String TOKEN_CHECK_URL = "http://wap.cmpassport.com:8080/api/tokenValidate";

    /**
     * TOKEN 验证
     *
     * @param token 统一认证平台凭证
     */
    public static CmccTokenValidateResponse checkToken(String token) throws BusinessException {
        CmccTokenValidateResponse cmccTokenValidateResponse;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(TOKEN_CHECK_URL)
                .post(RequestBody.create(MediaType.parse("application/json"), getMsg(SOURCE_ID, token).toString()))
                .build();

        Response response;
        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            throw new BusinessException(-1, "Connect time out");
        }
        if (response.isSuccessful()) {
            Headers responseHeaders = response.headers();
            for (int i = 0; i < responseHeaders.size(); i++) {
                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
            }
            cmccTokenValidateResponse = new Gson().fromJson(response.body().charStream(), CmccTokenValidateResponse.class);
            System.out.println("TOKEN验证成功" + cmccTokenValidateResponse.toString());
        } else {
            throw new BusinessException(response.code(), "Unexpected code " + response);
        }
        return cmccTokenValidateResponse;
    }

    /**
     * 返回请求参数
     */
    public static JSONObject getMsg(String sourceId, String token) {
        JSONObject header = new JSONObject();
        JSONObject body = new JSONObject();
        JSONObject msg = new JSONObject();
        try {
            String p_pattern = "yyyyMMddHHmmssSSS";
            SimpleDateFormat p_sdf = new SimpleDateFormat(p_pattern);
            // 定义要转换的Date对象，我的例子中使用了当前时间
            Calendar p_cal = Calendar.getInstance();
            Date p_date = p_cal.getTime();
            // 输出结果
            System.out.println("====>" + p_sdf.format(p_date));
            header.put("systemtime", p_sdf.format(p_date));
            header.put("version", "1.0");
            header.put("msgid", "abcde");// 目前没用处
            header.put("apptype", "5");
            header.put("sourceid", sourceId);
            body.put("token", token);
            msg.put("header", header);
            msg.put("body", body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return msg;
    }

}
