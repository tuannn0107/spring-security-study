package com.tnn.study.spring.security.controller.application;

import com.tnn.study.spring.security.SpringSecurityStudyConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationPublicController {
    @RequestMapping(value="/home", method=RequestMethod.GET)
    public String privateHome(ModelMap modelObj) {
        modelObj.addAttribute("welcomeTitle", "Home Page");
        modelObj.addAttribute("messageObj", "This Page Demonstrates How To Use Spring Security!");
        return SpringSecurityStudyConstants.ViewPath.APPLICATION +  "home";
    }
}
