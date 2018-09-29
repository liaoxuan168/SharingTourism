package tourism.base.errorcode;


/**
 * @Description:说明
 * @Author:xgchen
 * @Date:2016-06-30 16:29
 * @Version:V0.0.1
 */
public enum ErrorCode {

    SUCCESS("成功"),
    FAIL("失败"),

    //参数相关
    ERR1001("JSON格式错误"),
    ERR1002("参数错误"),
    ERR1003("必要参数不能为空"),
    ERR1004("参数不合法"),
    ERR1005("验证失败"),
    ERR1006("请求时间与当前时间不匹配"),

    //其他
    ERR5001("系统异常"),
    ERR5002("非法请求"),
    ERR5003("信息丢失");

    private final String text;

    public String getText() {
        return text;
    }

    public String getLabel() {
        return toString();
    }

    ErrorCode(String text) {
        this.text = text;
    }

}
