package com.anbu.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1")
public class TestController {

    @GetMapping("/greet")
    public String greeting() {
        return "Hello World!";
    }
}
