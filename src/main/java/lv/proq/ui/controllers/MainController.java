package lv.proq.ui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Artyom on 2/27/2016.
 */

@Controller
public class MainController {

    @RequestMapping(value = "main")
    public String main() {
        return "main";
    }
}
