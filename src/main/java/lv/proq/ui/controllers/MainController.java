package lv.proq.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Locale;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class MainController {

    @Autowired
    private LocaleResolver localeResolver;

    @RequestMapping(value = "/")
    public String main(Model model, Principal principal, HttpServletRequest request, HttpServletResponse response) {

        localeResolver.setLocale(request, response, new Locale("ru"));

        model.addAttribute("username", principal.getName());
        return "main";
    }
}
