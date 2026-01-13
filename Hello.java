package com.example.Day1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {

    // code yaha aayega
    @GetMapping("/")
    public  String hello(){
        return  "This is the first line";
    }

    // Add



}
