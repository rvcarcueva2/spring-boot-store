package com.reycel.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Annotation, give instructions to the compiler. Tells spring that this class should be used as a web controller for receiving traffic
@RestController

public class HomeController {
    @Value("${spring.application.name}") //  It allows you to externalize your application configurations—such as API keys, database URLs, or feature flags—so you do not have to hardcode them into your Java source code
    private String appName;

    @RequestMapping("/") // When the request is coming from "/", call index() method

    public String index() { // A method that returns string
        System.out.println(appName);
        return "index.html";
    }



}
