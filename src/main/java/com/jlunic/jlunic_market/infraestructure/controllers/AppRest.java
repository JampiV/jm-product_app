package com.jlunic.jlunic_market.application.controllers;

import com.jlunic.jlunic_market.domain.entities.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppRest {

    @GetMapping("/list")
    public List<Message> list(){
        return Collections.singletonList(new Message("Test list"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message){
        System.out.println("Message created" + message);
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code){
        return  Collections.singletonMap("code", code);
    }
}
