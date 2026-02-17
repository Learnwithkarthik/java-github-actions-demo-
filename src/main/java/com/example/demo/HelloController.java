package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Java app running in Docker via GitHub Actions!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
