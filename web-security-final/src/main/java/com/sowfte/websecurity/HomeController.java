package com.sowfte.websecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to server";
    }
    @GetMapping("/user")
    public String user(){
        return "Welcome to server user";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Welcome to server admin";
    }
}
