package com.royce.servicex.service;

import com.royce.servicecommon.entity.Country;
import org.springframework.stereotype.Service;

/**
 * 国家业务逻辑实现类
 *
 *
 */

@Service
public class CountryService {

    public Country findCountryByName(String countryName) {
        return new Country(1L, countryName);
    }

}