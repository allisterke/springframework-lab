package com.ally.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by ally on 7/9/17.
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    String login() {
        return "redirect:/companies";
    }
}
