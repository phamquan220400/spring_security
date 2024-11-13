package com.samuel.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @GetMapping("/test")
    public String userData(){
        return "Success";
    }

}
