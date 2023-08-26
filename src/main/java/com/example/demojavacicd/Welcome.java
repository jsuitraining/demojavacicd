package com.example.demojavacicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String getNotes(){
        return "welcome to CICD pipe line setup using jenkins";
    }
}
