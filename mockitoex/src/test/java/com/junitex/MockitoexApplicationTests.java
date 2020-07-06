package com.junitex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
class MockitoexApplicationTests {
	
	private static final String MOCK_OUTPUT = "welcome";
	@Mock
	private UserService userService;
	@BeforeEach
	void setMockOutput() {
		Mockito.when(userService.data()).thenReturn(MOCK_OUTPUT);
	}

	@Test
	public void sum_with1number() {
	
		assertEquals(userService.data(),MOCK_OUTPUT);
		
	}
}
