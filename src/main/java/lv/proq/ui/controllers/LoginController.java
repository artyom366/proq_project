package lv.proq.ui.controllers;


import lv.proq.ui.domain.User;
import lv.proq.ui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Artyom on 2/21/2016.
 */

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {

        User user = new User();
        user.setEnabled(true);
        user.setPassword("12345678");
        user.setUsername("artyom");
        userService.saveUser(user);

        return "login";
    }
}
