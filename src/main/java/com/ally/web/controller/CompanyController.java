package com.ally.web.controller;

import com.ally.web.mapper.CompanyMapper;
import com.ally.web.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ally on 7/5/17.
 */
@Controller
public class CompanyController {

    @Autowired
    CompanyMapper companyMapper;

    @RequestMapping("/companies")
    String getAllCompanies(Model model) {
        List<Company> companies = companyMapper.getAllCompanies();
        model.addAttribute("companies", companies);
        return "companies";
    }

    @RequestMapping("/company/{name}")
    String getOneCompany(@PathVariable(required = true) String name, Model model) {
        Company company = companyMapper.getCompany(name);
        model.addAttribute("companies", Arrays.asList(company));
        return "companies";
    }
}
