package com.sowfte.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to server user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Welcome to server admin";
    }
}
