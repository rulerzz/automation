package com.automation.automation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @GetMapping(path="/")
    String hello() {
        return "Hello World, Spring Boot! New commit";
    }


    @GetMapping(path="/qaautomation")
    String qaautomation() {
        return "Hello QA Automation!";
    }

}
