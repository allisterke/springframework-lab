package com.ally.web.mapper;

import com.ally.web.model.MaterialSupplyRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialSupplyMapper {
    @Insert("insert into material_supplied(ts, storeId, materialId, amount) values(NOW(), #{storeId}, #{materialId}, #{amount})")
    public void supply(MaterialSupplyRecord record);

    @Update("update material_remain set amount = amount + #{amount} where storeId = #{storeId} and materialId = #{materialId};")
    public void updateRemainingAmount(MaterialSupplyRecord record);
}
