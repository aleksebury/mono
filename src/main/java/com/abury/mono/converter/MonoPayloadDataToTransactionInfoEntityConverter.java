package com.abury.mono.converter;

import com.abury.mono.entity.TransactionInfoEntity;
import com.abury.mono.model.MonoPayloadDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MonoPayloadDataToTransactionInfoEntityConverter implements Converter<MonoPayloadDto.Data, TransactionInfoEntity> {

    @Override
    public TransactionInfoEntity convert(MonoPayloadDto.Data data) {
        var transactionInfo = new TransactionInfoEntity();
        transactionInfo.setAccount(data.getAccount());
        transactionInfo.setAmount(data.getStatementItem().getAmount());
        transactionInfo.setComment(data.getStatementItem().getComment());
        transactionInfo.setDescription(data.getStatementItem().getDescription());
        transactionInfo.setTime(data.getStatementItem().getTime());
        return transactionInfo;
    }
}
