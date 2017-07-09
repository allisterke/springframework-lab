package com.ally.web.mapper;

import com.ally.web.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/5/17.
 */
@Mapper
public interface CompanyMapper {
    @Select("select * from companies")
    List<Company> getAllCompanies();

    @Select("select * from companies where name = #{name}")
    Company getCompany(String name);
}
