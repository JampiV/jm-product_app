package com.jlunic.jlunic_market.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

    private String text;

    public Message(String text) {
        this.text = text;
    }

    public Message() {
    }
}
