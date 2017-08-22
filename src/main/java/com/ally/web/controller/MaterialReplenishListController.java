package com.ally.web.controller;

import com.ally.web.mapper.MaterialInsufficientCountMapper;
import com.ally.web.mapper.MaterialReplenishListMapper;
import com.ally.web.model.MaterialReplenishRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialReplenishListController {
    @Autowired
    MaterialInsufficientCountMapper insufficientCountMapper;

    @Autowired
    MaterialReplenishListMapper replenishListMapper;

    @GetMapping("/replenish")
    List<MaterialReplenishRecord> replenish() {
        List<MaterialReplenishRecord> list = Collections.emptyList();
        if(insufficientCountMapper.checkIfInsufficient() > 0) {
            list = replenishListMapper.getMaterialReplenishmentList();
        }
        return list;
    }
}
