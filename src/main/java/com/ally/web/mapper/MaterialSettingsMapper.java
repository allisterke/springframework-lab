package com.ally.web.mapper;

import com.ally.web.model.MaterialSettings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by ally on 7/24/17.
 */
@Mapper
public interface MaterialSettingsMapper {
    @Select("select * from material_settings")
    public List<MaterialSettings> getSettings();

    @Update("update material_settings set warn = #{warn}, fill = #{fill} where materialId = #{materialId}")
    public void updateSettings(MaterialSettings settings);
}
