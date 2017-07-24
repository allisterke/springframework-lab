package com.ally.web.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialInsufficientCountMapper {
    @Select("select count(*) from material_remain r join material_settings s on r.storeId = s.storeId and r.materialId = s.materialId where r.amount < s.must")
    public int checkIfInsufficient();
}
