package tourism.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tourism.bean.User;
import tourism.service.UserService;

/**
 * @author liaoxuan
 * @date 2018-9-25-0025.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/registy.do")
    public ModelAndView registy(String nickName,String userNo,String password,String phoneNumber,String email){
        User user = new User(userNo,nickName,password,phoneNumber,email);
        userService.put(user);
        return new ModelAndView("index");
    }
}
