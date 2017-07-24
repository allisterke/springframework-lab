package com.ally.web.mapper;

import com.ally.web.model.Material;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialMapper {
    @Select("select * from material")
    List<Material> getMaterialList();
}
