package com.royce.servicey.feign;

import com.royce.servicecommon.entity.Country;

import java.util.UUID;

public class FeignClientFallback implements CallServiceXFeignClient {

    public Country getCountry(String countryName) {
        return new Country(UUID.randomUUID().getLeastSignificantBits(), "Failed");
    }
}
