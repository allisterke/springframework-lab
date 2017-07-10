package com.ally.web.controller;

import com.ally.web.mapper.CompanyMapper;
import com.ally.web.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ally on 7/9/17.
 */
@RestController
@RequestMapping("/rest")
public class CompanyRestController {
    @Autowired
    CompanyMapper companyMapper;

    @RequestMapping("/companies")
    List<Company> getAllCompanies() {
        List<Company> companies = companyMapper.getAllCompanies();
        return companies;
    }

    @RequestMapping("/company/{name}")
    List<Company> getOneCompany(@PathVariable(required = true) String name) {
        Company company = companyMapper.getCompany(name);
        return Arrays.asList(company);
    }
}
