package com.ally.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ally on 7/4/17.
 */
@RestController
public class SuccessController {

    @RequestMapping("/success")
    String succeed() {
        return "success";
    }
}
