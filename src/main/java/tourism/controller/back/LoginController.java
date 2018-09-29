package tourism.controller.back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tourism.base.errorcode.ErrorCode;
import tourism.bean.User;
import tourism.controller.back.dto.BaseResponseDTO;
import tourism.service.UserService;
import tourism.utils.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author liaoxuan
 * @date 2018-9-25-0025.
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login.html", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String login(String userNo, String password, HttpSession session) {
        if (StringUtils.isBlank(userNo) || StringUtils.isBlank(password)) {
            return new BaseResponseDTO(ErrorCode.FAIL.getLabel(), "请填写账户和密码").toJson();
        }
        User user = userService.login(userNo, password);
        if (user == null) {
            return new BaseResponseDTO(ErrorCode.FAIL.getLabel(), "账户或密码错误").toJson();
        }
        session.setAttribute("user", user);
        return new BaseResponseDTO(ErrorCode.SUCCESS.getLabel(), ErrorCode.SUCCESS.getText()).toJson();
    }
}
