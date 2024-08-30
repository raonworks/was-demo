package com.example.wasdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Value("${welcome.string}")
    private String welcome;

    @GetMapping("/")
    public String index() {
        return welcome;
    }
}
