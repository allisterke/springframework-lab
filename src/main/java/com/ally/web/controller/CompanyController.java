package com.ally.web.controller;

import com.ally.web.mapper.CompanyMapper;
import com.ally.web.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ally on 7/5/17.
 */
@RestController
public class CompanyController {

    @Autowired
    CompanyMapper companyMapper;

    @RequestMapping("/companies")
    List<Company> getAllCompanies() {
        List<Company> companies = companyMapper.getAllCompanies();
        return companies;
    }

    @RequestMapping("/company")
    Company getOneCompany() {
        Company company = companyMapper.getOneCompany();
        return company;
    }
}
