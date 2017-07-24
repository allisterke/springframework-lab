package com.ally.web.mapper;

import com.ally.web.model.MaterialConsumeRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialConsumeMapper {
    @Insert("insert into material_scanned values(#{id}, #{ts}, #{storeId}, #{materialId}, #{amount}")
    public void consume(MaterialConsumeRecord record);

    @Update("update material_remain set amount = amount - #{amount} where storeId = #{storeId} and materialId = #{materialId}")
    public void updateRemainingAmount(MaterialConsumeRecord record);
}
