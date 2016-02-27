package lv.proq.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.Locale;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String main(Locale locale, Model model, Principal principal) {

        model.addAttribute("username", principal.getName());
        return "main";
    }
}
