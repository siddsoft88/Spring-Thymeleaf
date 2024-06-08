package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {

    @GetMapping("/")
    public String getMethodName() {
        return new String("index");
    }
    

    @GetMapping("/index2")
    public String getIndex2Name() {
        return new String("index2");
    }
}
