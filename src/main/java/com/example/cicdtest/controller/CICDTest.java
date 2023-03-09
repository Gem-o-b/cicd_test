package com.example.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDTest {
    @GetMapping("/")
    public String test(){
        return "hello world";
    }
}
