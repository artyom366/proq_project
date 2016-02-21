package lv.proq.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Artyom on 2/21/2016.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
