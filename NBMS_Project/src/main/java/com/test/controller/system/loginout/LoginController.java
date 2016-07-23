package com.test.controller.system.loginout;

import com.test.controller.system.AbstractSystemController;
import com.test.persistence.entity.system.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/system/login")
public class LoginController extends AbstractSystemController {

    /**
     * 用户登录
     * @param user
     * @return
     */
    @RequestMapping(value = "login" + ACTION, method = RequestMethod.POST)
    public String login(@RequestParam("user") User user) {

        return directory() + "login";
    }

    /**
     * 用户退出
     * @param user
     * @return
     */
    @RequestMapping(value = "logout" + ACTION, method = RequestMethod.POST)
    public String logout(@RequestParam("user") User user) {

        return "system/login/";
    }

    public String directory() {
        return "system/login/";
    }
}
