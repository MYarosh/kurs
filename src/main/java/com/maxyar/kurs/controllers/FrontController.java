package com.maxyar.kurs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/")
    public String greeting() {
        return "index";
    }

    @GetMapping("/Table")
    public String tablepage() {
        return "main";
    }

    @GetMapping("/Function")
    public String funcpage() {
        return "functions";
    }
}
