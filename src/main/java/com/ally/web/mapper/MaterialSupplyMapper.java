package com.ally.web.mapper;

import com.ally.web.model.MaterialSupplyRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialSupplyMapper {
    @Insert("insert into material_supplied(ts, storeId, materialId, amount) values(NOW(), #{storeId}, #{materialId}, #{amount}")
    public void supply(MaterialSupplyRecord record);

    @Insert("insert into material_remain values(#{storeId}, #{materialId}, #{amount}) on duplicate key update amount = amount + #{amount};")
    public void updateRemainingAmount(MaterialSupplyRecord record);
}
