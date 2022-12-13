package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.example.hello.controller
 *
 * @author xzwnp
 * 2022/12/13
 * 14:53
 */
@RequestMapping("hello")
@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(String name) {
        return "你好!" + name;
    }
}
