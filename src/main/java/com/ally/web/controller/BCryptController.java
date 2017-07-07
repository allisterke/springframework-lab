package com.ally.web.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ally on 7/7/17.
 */
@RestController
public class BCryptController {

    @RequestMapping("/bcrypt/{input}")
    public String encode(@PathVariable(name = "input", required = true) String input) {
        return new BCryptPasswordEncoder().encode(input);
    }
}
