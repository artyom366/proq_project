package lv.proq.ui.controllers;


import lv.proq.ui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Artyom on 2/21/2016.
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        return "logout";
    }

}
