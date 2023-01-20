package com.hjy.petShop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AppController {

    @GetMapping("/index")
    public String hello() {
        return "index";
    }
}
