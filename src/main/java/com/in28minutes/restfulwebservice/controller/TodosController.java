package com.in28minutes.restfulwebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodosController {

    @GetMapping("users")
    public String getData(){
        return "hello world..";
    }

}
