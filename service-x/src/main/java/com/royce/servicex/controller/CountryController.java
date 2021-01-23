package com.royce.servicex.controller;

import com.royce.servicecommon.entity.Country;
import com.royce.servicex.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Country 控制层
 *
 * 
 */

@RestController
public class CountryController {

    private CountryService countryService;

    @Autowired
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping(value="/api/country/{countryName}")
    public Country getMethodName(@PathVariable(value = "countryName", required = true) String countryName) {
        return countryService.findCountryByName(countryName);
    }


}