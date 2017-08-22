package com.ally.web.controller;

import com.ally.web.mapper.MaterialMapper;
import com.ally.web.model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialController {
    @Autowired
    MaterialMapper materialMapper;

    @GetMapping("/material")
    List<Material> getMaterialList() {
        return materialMapper.getMaterialList();
    }
}
