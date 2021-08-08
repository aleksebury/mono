package com.abury.mono.converter;

import com.abury.mono.entity.TransactionInfo;
import com.abury.mono.model.Data;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TransactionInfoConverter implements Converter<Data, TransactionInfo> {

    @Override
    public TransactionInfo convert(Data data) {
        var transactionInfo = new TransactionInfo();
        transactionInfo.setAccount(data.getAccount());
        transactionInfo.setAmount(data.getStatementItem().getAmount());
        transactionInfo.setComment(data.getStatementItem().getComment());
        transactionInfo.setDescription(data.getStatementItem().getDescription());
        transactionInfo.setTime(data.getStatementItem().getTime());
        return transactionInfo;
    }
}
