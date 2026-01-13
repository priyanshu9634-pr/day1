package com.example.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String hello() {
        return "This is the first Line";
    }

    @GetMapping("/about")
    public String about() {
        return "This is the about route";
    }

    @GetMapping("/contact")
    public String contact() {
        return "This is the contact route";
    }
}


