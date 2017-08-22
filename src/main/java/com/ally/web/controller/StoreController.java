package com.ally.web.controller;

import com.ally.web.mapper.StoreMapper;
import com.ally.web.model.Store;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@RestController
public class StoreController {
    @Autowired
    StoreMapper storeMapper;

    @GetMapping("/store")
    List<Store> getStoreList() {
        return storeMapper.getStoreList();
    }
}
