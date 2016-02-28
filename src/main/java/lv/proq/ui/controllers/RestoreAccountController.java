package lv.proq.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Marina on 2/28/2016.
 */

@Controller
public class RestoreAccountController {

    @RequestMapping(value = "restore")
    public String restore() {
        return "restore";
    }
}
