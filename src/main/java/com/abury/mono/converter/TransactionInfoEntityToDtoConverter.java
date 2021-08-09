package com.abury.mono.converter;

import com.abury.mono.entity.TransactionInfoEntity;
import com.abury.mono.model.TransactionInfoDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TransactionInfoEntityToDtoConverter implements Converter<TransactionInfoEntity, TransactionInfoDto> {
    @Override
    public TransactionInfoDto convert(TransactionInfoEntity source) {
        var dto = new TransactionInfoDto();
        dto.setId(source.getId());
        dto.setAccount(source.getAccount());
        dto.setAmount(source.getAmount());
        dto.setComment(source.getComment());
        dto.setDescription(source.getDescription());
        dto.setTime(source.getTime());
        return dto;
    }
}
