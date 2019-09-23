package com.graphqljava.tutorial;

import lombok.Data;

@Data
public class Quote {
    String type;
    Value value;
}

@Data
class Value {
    int id;
    String quote;
}
