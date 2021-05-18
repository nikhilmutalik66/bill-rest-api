package com.thinkit.billsapp.billsrestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillsController {

    @GetMapping("/")
    public String Hello(){
        return "hello-Spring-Rest-API";
    }

}
