package com.bmstu.wmarket.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class UserController {

    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }
}
