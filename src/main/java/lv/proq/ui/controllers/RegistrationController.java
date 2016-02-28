package lv.proq.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class RegistrationController {

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }
}
