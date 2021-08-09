package com.abury.mono.rest;

import com.abury.mono.model.TransactionInfoDto;
import com.abury.mono.service.PersonalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@Slf4j
public class TransactionController {

    @Autowired
    private PersonalService personalService;

    @GetMapping("/get-all")
    public List<TransactionInfoDto> getAll() {
        return personalService.getAll();
    }
}
