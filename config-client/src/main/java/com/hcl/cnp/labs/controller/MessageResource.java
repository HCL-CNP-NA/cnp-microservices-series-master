package com.hcl.cnp.labs.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/api")
@RestController
public class MessageResource {

    @Value("${repo.message.test: Hello CNP}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
