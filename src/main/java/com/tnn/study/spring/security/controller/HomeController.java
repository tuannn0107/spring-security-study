package com.tnn.study.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/home", method=RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(ModelMap modelObj) {
        return "login";
    }

    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String privateHome(ModelMap modelObj) {
        modelObj.addAttribute("welcomeTitle", "Admministrator Control Panel");
        modelObj.addAttribute("messageObj", "This Page Demonstrates How To Use Spring Security!");
        return "admin";
    }
}
