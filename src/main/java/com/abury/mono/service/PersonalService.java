package com.abury.mono.service;

import com.abury.mono.converter.MonoPayloadDataToTransactionInfoEntityConverter;
import com.abury.mono.converter.TransactionInfoEntityToDtoConverter;
import com.abury.mono.model.MonoPayloadDto;
import com.abury.mono.model.TransactionInfoDto;
import com.abury.mono.repository.TransactionInfoRepository;
import com.google.common.collect.Streams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonalService {

    @Autowired
    private TransactionInfoRepository repository;
    @Autowired
    private MonoPayloadDataToTransactionInfoEntityConverter monoPayloadDataToTransactionInfoEntityConverter;
    @Autowired
    private TransactionInfoEntityToDtoConverter transactionInfoEntityToDtoConverter;

    public void save(MonoPayloadDto.Data data) {
        var transactionInfo = monoPayloadDataToTransactionInfoEntityConverter.convert(data);
        var savedTransaction = repository.save(Objects.requireNonNull(transactionInfo));
        log.info("Saved transaction: {}", savedTransaction);
    }

    public List<TransactionInfoDto> getAll() {
        var transactionInfoEntities = repository.findAll();
        return Streams.stream(transactionInfoEntities)
                .map(transactionInfoEntity -> transactionInfoEntityToDtoConverter.convert(transactionInfoEntity))
                .collect(Collectors.toList());
    }

}
