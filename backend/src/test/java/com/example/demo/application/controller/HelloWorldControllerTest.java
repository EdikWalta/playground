package com.example.demo.application.controller;

import com.example.demo.domain.usecase.HelloWorldUseCase;
import com.example.demo.domain.usecase.impl.HelloWorldUseCaseImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class HelloWorldControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        HelloWorldUseCase useCase = new HelloWorldUseCaseImpl();
        HelloWorldController controller = new HelloWorldController(useCase);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void hello_shouldReturnHelloWorld() throws Exception {
        mockMvc.perform(get("/api/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello World"));
    }
}