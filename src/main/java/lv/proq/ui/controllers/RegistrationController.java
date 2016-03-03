package lv.proq.ui.controllers;

import lv.proq.ui.errors.AuthorityExistsException;
import lv.proq.ui.errors.UserExistsException;
import lv.proq.ui.service.AuthService;
import lv.proq.ui.service.TrialAccountService;
import lv.proq.ui.service.UserService;
import lv.proq.ui.transfer.TrialAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Contended;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.Locale;


@Controller
public class RegistrationController {

    @Autowired
    private TrialAccountService trialAccountService;

    @Autowired
    private AuthService authService;


    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String getRegisterView(Model model) {

        TrialAccountDTO trialAccount = new TrialAccountDTO();
        model.addAttribute("trialAccount", trialAccount);
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String doRegister(@Validated @ModelAttribute("trialAccount") TrialAccountDTO account, BindingResult result, Locale locale) {

        if (result.hasErrors()) {
            return "register";
        }

        try {
            trialAccountService.saveTrialAccountDetails(account, locale);
        } catch (AuthorityExistsException | UserExistsException e) {
            e.printStackTrace();
        }


        authService.authorizeUser(account.getUserName(), account.getPassword());

        return "redirect:/";
    }
}
