package com.problem.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class ProblemOneTest {

	private static final int EMPTY_STRING_LENGTH = 0;
	private static final String EMPTY_STRING = "";

	@Test
	void get_content_length_should_return_4() {
		String content = "abhi";
		int actual = ProblemOne.getContentLength(content);
		int expected = 4;
		assertEquals(expected, actual);
	}
	
	@Test
	void get_content_length_should_return_18() {
		String content = "abhishek malvadkar";
		int actual = ProblemOne.getContentLength(content);
		int expected = 18;
		assertEquals(expected, actual);
	}
	
	@Test
	void get_content_length_should_return_0() {
		String content = EMPTY_STRING;
		int actual = ProblemOne.getContentLength(content);
		int expected = EMPTY_STRING_LENGTH;
		assertEquals(expected, actual);
	}
	
	@Test
	void get_content_length_should_throw_exception() {
		String content = null;
		Executable executable = () -> ProblemOne.getContentLength(content);
		assertThrows(IllegalArgumentException.class, executable);
	}

}
