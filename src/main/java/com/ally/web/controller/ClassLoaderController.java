package com.ally.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClassLoaderController {

    @GetMapping("/classloader")
    List<String> getClassLoaderHierarchy() {
        List<String> list = new ArrayList<>();
        for(ClassLoader cl = this.getClass().getClassLoader();
                cl != null; cl = cl.getParent()) {
            list.add(cl.getClass().getCanonicalName());
        }
        return list;
    }
}
