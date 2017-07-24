package com.ally.web.controller;

import com.ally.web.mapper.MaterialRemainMapper;
import com.ally.web.model.MaterialRemainRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialRemainController {
    @Autowired
    MaterialRemainMapper remainMapper;

    @GetMapping("/remain")
    List<MaterialRemainRecord> getRemainList() {
        return remainMapper.getRemain();
    }
}
