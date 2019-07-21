package com.tnn.study.spring.security.controller.admin;

import com.tnn.study.spring.security.SpringSecurityStudyConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationAdminController {

    @RequestMapping(value="/loginAdmin", method=RequestMethod.GET)
    public String login(ModelMap modelObj) {
        return "login";
    }

    @RequestMapping(value="/adminHome", method=RequestMethod.GET)
    public String privateHome(ModelMap modelObj) {
        modelObj.addAttribute("welcomeTitle", "Admministrator Control Panel");
        modelObj.addAttribute("messageObj", "This Page Demonstrates How To Use Spring Security!");
        return SpringSecurityStudyConstants.ViewPath.ADMIN + "adminHome";
    }
}
