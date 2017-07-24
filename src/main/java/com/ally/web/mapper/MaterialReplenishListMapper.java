package com.ally.web.mapper;

import com.ally.web.model.MaterialReplenishRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialReplenishListMapper {
    @Select("select r.storeId storeId, r.materialId materialId, s.fill - r.amount amount from material_remain r join material_settings s on r.storeId = s.storeId and r.materialId = s.materialId where r.amount < s.warn")
    public List<MaterialReplenishRecord> getMaterialReplenishmentList();
}
