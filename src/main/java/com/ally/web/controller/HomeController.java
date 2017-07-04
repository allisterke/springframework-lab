package com.ally.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ally on 7/4/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    Map<String, String> home() {
        Map<String, String> map = new HashMap<>();
        map.put("greeting", "hello, world");
        return map;
    }
}
