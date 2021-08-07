package com.abury.mono.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class StatementItem {
    private String id;
    private long time;
    private String description;
    private String comment;
    private long mcc;
    private long originalMcc;
    private long amount;
    private long operationAmount;
    private int currencyCode;
    private long commissionRate;
    private long cashbackAmount;
    private long balance;
    private boolean hold;
}
