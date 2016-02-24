package lv.proq.ui.controllers;

import lv.proq.ui.dao.UserDAO;
import lv.proq.ui.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Artyom on 2/21/2016.
 */

@Controller
public class LoginController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {

        User user = new User();
        user.setEnabled(true);
        user.setPassword("12345678");
        user.setUsername("art");

        userDAO.create(user);

        return "login";
    }
}
