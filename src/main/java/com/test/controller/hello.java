package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/4/24.
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}