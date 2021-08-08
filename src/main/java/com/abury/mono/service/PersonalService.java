package com.abury.mono.service;

import com.abury.mono.converter.TransactionInfoConverter;
import com.abury.mono.model.Data;
import com.abury.mono.repository.TransactionInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
public class PersonalService {

    @Autowired
    private TransactionInfoRepository repository;
    @Autowired
    private TransactionInfoConverter transactionInfoConverter;

    public void save(Data data) {
        var transactionInfo = transactionInfoConverter.convert(data);
        var savedTransaction = repository.save(Objects.requireNonNull(transactionInfo));
        log.info("Saved transaction: {}", savedTransaction);
    }

}
