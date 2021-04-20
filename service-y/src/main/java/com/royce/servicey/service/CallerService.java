package com.royce.servicey.service;

import com.royce.servicecommon.entity.Country;
import com.royce.servicey.feign.CallServiceXFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 调用方的服务实现
 *
 */

@Service
public class CallerService {

    private CallServiceXFeignClient callServiceXFeignClient;

    @Autowired
    public void setCallerFeignClient(@Qualifier("com.royce.servicey.feign.CallServiceXFeignClient") CallServiceXFeignClient callServiceXFeignClient) {
        this.callServiceXFeignClient = callServiceXFeignClient;
    }

    public Country findCountryByName(String countryName) {
        return callServiceXFeignClient.getCountry(countryName);
    }

}