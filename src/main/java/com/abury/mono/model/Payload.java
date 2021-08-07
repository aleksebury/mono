package com.abury.mono.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Payload {
    private String type;
    private Data data;
}
