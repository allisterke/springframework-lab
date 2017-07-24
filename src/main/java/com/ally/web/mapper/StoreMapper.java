package com.ally.web.mapper;

import com.ally.web.model.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface StoreMapper {
    @Select("select * from store")
    List<Store> getStoreList();
}
