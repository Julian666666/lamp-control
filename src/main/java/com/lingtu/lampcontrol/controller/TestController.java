package com.lingtu.lampcontrol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController.java
 * @Description TODO
 * @Author 朱福盛
 * @Date 2020/6/10 8:35
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "test";
    }
}
