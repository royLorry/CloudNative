package com.royce.servicex.service;

import com.royce.servicecommon.entity.Country;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * 国家业务逻辑实现类
 *
 *
 */

@Service
public class CountryService {

    public Country findCountryByName(String countryName) {
        return new Country(UUID.randomUUID().getLeastSignificantBits(), countryName);
    }

}