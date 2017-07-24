package com.ally.web.mapper;

import com.ally.web.model.MaterialRemainRecord;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
public interface MaterialRemainMapper {
    @Select("select * from material_remain")
    List<MaterialRemainRecord> getRemain();
}
