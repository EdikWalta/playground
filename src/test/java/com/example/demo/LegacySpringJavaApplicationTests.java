package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LegacySpringJavaApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void failing() {
		assertEquals(2, 3);
	}

}
