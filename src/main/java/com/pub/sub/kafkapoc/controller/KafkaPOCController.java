package com.pub.sub.kafkapoc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.Date;

@Controller
@RequestMapping("/kafka")
public class KafkaPOCController {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "Welcome to my Kafka-poc Project!";
    }

    @GetMapping("/producer-form")
    public String producer(Model theModel) {

        theModel.addAttribute("theDate", new Date());

        return "helloworld";
    }
    
}
