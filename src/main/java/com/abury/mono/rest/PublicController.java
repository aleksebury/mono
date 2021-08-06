package com.abury.mono.rest;

import com.abury.mono.model.CurrencyInfo;
import com.abury.mono.service.PublicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private PublicService publicService;

    @GetMapping("/currency")
    public CurrencyInfo[] getRate() {
        return publicService.getRate();
    }
}
