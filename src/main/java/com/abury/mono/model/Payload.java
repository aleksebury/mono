package com.abury.mono.model;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Payload {
    private String type;
    private Data data;
}
