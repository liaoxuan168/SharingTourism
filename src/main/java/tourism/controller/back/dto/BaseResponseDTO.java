package tourism.controller.back.dto;

import com.alibaba.fastjson.JSON;

/**
 * @author liaoxuan
 * @date 2018-9-28-0028.
 */
public class BaseResponseDTO {
    private String code;
    private String message;

    public BaseResponseDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }

    public BaseResponseDTO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
