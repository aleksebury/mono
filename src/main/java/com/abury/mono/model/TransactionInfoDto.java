package com.abury.mono.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TransactionInfoDto {
    private Long id;
    private String account;
    private long time;
    private String description;
    private String comment;
    private long amount;
}
