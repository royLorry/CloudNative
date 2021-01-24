package com.royce.servicey.feign;

import com.royce.servicecommon.entity.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "service-x")
public interface CallServiceXFeignClient {

    @PostMapping(value = "/api/country/{countryName}")
    public Country getCountry(@PathVariable(name = "countryName", required = true) String countryName);
}
