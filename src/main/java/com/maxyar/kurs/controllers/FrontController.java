package com.maxyar.kurs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/")
    public String greeting() {
        return "index";
    }

    @GetMapping("/Main")
    public String mainpage() {
        return "main";
    }

}