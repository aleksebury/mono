package com.abury.mono.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Setter
@Getter
@ToString
public class CurrencyInfoDto {
    private int currencyCodeA;
    private int currencyCodeB;
    private long date;
    private float rateSell;
    private float rateBuy;
    private float rateCross;
}
