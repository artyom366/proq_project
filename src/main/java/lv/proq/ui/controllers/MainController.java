package lv.proq.ui.controllers;

import lv.proq.ui.domain.organization.Organization;
import lv.proq.ui.domain.user.User;
import lv.proq.ui.domain.user.UserSettings;
import lv.proq.ui.service.OrganizationService;
import lv.proq.ui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class MainController {

    @Autowired
    private LocaleResolver localeResolver;

    @Autowired
    private OrganizationService organizationService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String main(Model model, Principal principal, HttpServletRequest request, HttpServletResponse response) {

        User user = userService.findOne(principal.getName());
        if (user == null) {
            //todo error
        }

        Organization userDefaultOrganization = user.getUserSettings().getDefaultOrganization();
        if (userDefaultOrganization == null) {
            //todo error
        }

        List<Organization> userOrganizations = organizationService.findAllUsersByUsers(user);
        if (userOrganizations == null) {
            //todo error
        }

        localeResolver.setLocale(request, response, new Locale(user.getUserSettings().getLocale()));
        model.addAttribute("username", user.getUsername());
        model.addAttribute("defaultorganization", userDefaultOrganization.getName());
        model.addAttribute("allorganizations", userOrganizations);

        return "main";
    }
}
