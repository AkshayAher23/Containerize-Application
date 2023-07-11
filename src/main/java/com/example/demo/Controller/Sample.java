package com.example.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("/getMessage")
    public String sendMessage(){
        return "Hi Akshay";
    }

}
