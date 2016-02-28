package lv.proq.ui.controllers;

import lv.proq.ui.service.UserService;
import lv.proq.ui.transfer.TrialAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Contended;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String getRegisterView() {
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String doRegister(@Validated TrialAccountDTO account, BindingResult result) {

        if (result.hasErrors()) {
            return "register";
        }

        //userService.saveUser();




        return "main";
    }
}
