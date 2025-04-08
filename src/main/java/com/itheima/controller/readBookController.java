package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readBook")
public class readBookController {
    @GetMapping
    public String readBook() {
        return "Read Book";
    }
}
