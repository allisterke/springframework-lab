package com.ally.web.controller;

import com.ally.web.mapper.MaterialConsumeMapper;
import com.ally.web.model.MaterialConsumeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class MaterialConsumeController {
    @Autowired
    MaterialConsumeMapper consumeMapper;

    @GetMapping("/consume")
    String scanqrc(@RequestParam("id") String id,
                   @RequestParam("ts") Timestamp ts,
                   @RequestParam("storeId") String storeId,
                   @RequestParam("materialId") String materialId,
                   @RequestParam("amount") double amount) {

        MaterialConsumeRecord record = new MaterialConsumeRecord();
        record.setId(id);
        record.setTs(ts);
        record.setStoreId(storeId);
        record.setMaterialId(storeId);
        record.setAmount(amount);

        consumeMapper.consume(record);
        consumeMapper.updateRemainingAmount(record);

        return "ok";
    }
}
