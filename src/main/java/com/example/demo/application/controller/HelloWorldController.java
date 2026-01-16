package com.example.demo.application.controller;

import com.example.demo.domain.usecase.HelloWorldUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    private final HelloWorldUseCase helloWorldUseCase;

    public HelloWorldController(HelloWorldUseCase helloWorldUseCase) {
        this.helloWorldUseCase = helloWorldUseCase;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloWorldUseCase.getHelloWorld();
    }
}