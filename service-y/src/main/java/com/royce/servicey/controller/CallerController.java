package com.royce.servicey.controller;

import com.royce.servicecommon.entity.Country;
import com.royce.servicey.feign.CallServiceXFeignClient;
import com.royce.servicey.service.CallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 调用方的控制层
 */

@RestController
public class CallerController {

    private CallerService callerService;

    @Autowired
    public void setCallerService(CallerService callerService) {
        this.callerService = callerService;
    }

    @PostMapping(value = "/api/country/{countryName}")
    public Country getCountry(@PathVariable(value = "countryName", required = true) String countryName) {
        return callerService.findCountryByName(countryName);
    }


}