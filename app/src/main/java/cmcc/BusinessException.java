package cmcc;

/**
 * Created by yinghuihong on 16/3/3.
 */
public class BusinessException extends Exception {

    private int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }


    public int getCode() {
        return code;
    }


}
