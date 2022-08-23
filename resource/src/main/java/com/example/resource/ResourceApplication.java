package com.example.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableZuulProxy
public class ResourceApplication {
    @RequestMapping("/")
    @CrossOrigin(origins = "*", maxAge = 3600,
            allowedHeaders={"x-auth-token", "x-requested-with", "x-xsrf-token"})
    public Message home() {
        return new Message("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

}
