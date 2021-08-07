package com.abury.mono.service;

import com.abury.mono.entity.TransactionInfo;
import com.abury.mono.model.Data;
import com.abury.mono.repository.TransactionInfoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonalService {

    @Autowired
    private TransactionInfoRepository repository;

    public void save(Data data) {
        var transactionInfo = new TransactionInfo();
        transactionInfo.setAccount(data.getAccount());
        transactionInfo.setAmount(data.getStatementItem().getAmount());
        transactionInfo.setComment(data.getStatementItem().getComment());
        transactionInfo.setDescription(data.getStatementItem().getDescription());
        transactionInfo.setTime(data.getStatementItem().getTime());
        var savedTransaction = repository.save(transactionInfo);
        log.info("Saved transaction: {}", savedTransaction);
    }

}
