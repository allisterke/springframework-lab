package com.ally.web.controller;

import com.ally.web.mapper.MaterialSupplyMapper;
import com.ally.web.model.MaterialSupplyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialSupplyController {

    @Autowired
    MaterialSupplyMapper supplyMapper;

    @GetMapping("/supply")
    String supply(@RequestParam("storeId") int storeId,
                  @RequestParam("materialId") int materialId,
                  @RequestParam("amount") double amount) {

        MaterialSupplyRecord record = new MaterialSupplyRecord();
        record.setStoreId(storeId);
        record.setMaterialId(materialId);
        record.setAmount(amount);

        supplyMapper.supply(record);
        supplyMapper.updateRemainingAmount(record);

        return "ok";
    }
}
