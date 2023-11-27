package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestsPelindrome {

	@TestFactory
	public Stream<DynamicTest> dynamicTestForPelindrome() {
		return Stream.of("pop", "dad", "nayan", "madam", "mom").map(inputText -> DynamicTest.dynamicTest(inputText,

				() -> Assertions.assertTrue(Myutils.isPalindrome(inputText))));

	}

}
