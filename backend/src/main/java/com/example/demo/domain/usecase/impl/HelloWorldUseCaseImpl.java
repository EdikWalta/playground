package com.example.demo.domain.usecase.impl;

import com.example.demo.domain.usecase.HelloWorldUseCase;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldUseCaseImpl implements HelloWorldUseCase {

    @Override
    public String getHelloWorld() {
        return "Hello World";
    }
}