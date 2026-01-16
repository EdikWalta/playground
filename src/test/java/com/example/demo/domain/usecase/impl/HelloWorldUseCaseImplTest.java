package com.example.demo.domain.usecase.impl;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldUseCaseImplTest {

    @Test
    void getHelloWorld_shouldReturnHelloWorld() {
        // Given
        HelloWorldUseCaseImpl useCase = new HelloWorldUseCaseImpl();

        // When
        String result = useCase.getHelloWorld();

        // Then
        assertThat(result).isEqualTo("Hello World");
    }
}