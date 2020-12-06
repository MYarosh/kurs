package com.maxyar.kurs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackController {

    @GetMapping("/man")
    public String greeting() {

        return "main";
    }

}
