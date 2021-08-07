package com.abury.mono.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

@Entity(name = "transactionInfo")
@Getter
@Setter
@ToString
public class TransactionInfo {
    @Id
    private Long id;
    private String account;
    private long time;
    private String description;
    private String comment;
    private long amount;
}
