package com.problem.one;

import java.util.Objects;

public class ProblemOne {
	
	private static final String CONTENT_NULL_EXCEPTION_MESSAGE = "content should not be null";

	public static int getContentLength(String content) {
		
		checkForNull(content);
		
		return content.length();
	}

	private static void checkForNull(String content) {
		if (Objects.isNull(content)) {
			throw new IllegalArgumentException(CONTENT_NULL_EXCEPTION_MESSAGE);
		}
	}

}
