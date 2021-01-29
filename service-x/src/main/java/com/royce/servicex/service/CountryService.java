package com.royce.servicex.service;

import com.royce.servicecommon.entity.Country;
import com.royce.servicecommon.util.LoggerUtil;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.UUID;

/**
 * 国家业务逻辑实现类
 *
 *
 */

@Service
public class CountryService {

    public Country findCountryByName(String countryName) {
        LoggerUtil.info("[CountryService]========={}", "被调用");
        return new Country(UUID.randomUUID().getLeastSignificantBits(), countryName);
    }

}