package com.abury.mono.service;

import com.abury.mono.model.CurrencyInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PublicService {

    @Value("${monobank.endpoint}")
    private String monobankApi;

    @Autowired
    private RestTemplate restTemplate;

    @Cacheable("rate")
    public CurrencyInfo[] getRate() {
        log.info("Caching bank rates...");
        return restTemplate.getForObject(monobankApi.concat("/bank/currency"), CurrencyInfo[].class);
    }
}
