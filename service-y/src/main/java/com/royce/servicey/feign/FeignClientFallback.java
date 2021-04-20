package com.royce.servicey.feign;

import com.royce.servicecommon.entity.Country;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FeignClientFallback implements CallServiceXFeignClient {

    @Override
    public Country getCountry(String countryName) {
        return new Country(UUID.randomUUID().getLeastSignificantBits(), "Failed");
    }
}
