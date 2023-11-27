package com.app.junitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class ArgumentConversionDemo {

	// Implicit conversion using @CsvSource
	@ParameterizedTest
	@CsvSource({ "42, 5", "10, 7", "2, 2" })
	void testImplicitConversion(int a, int b) {
		int result = add(a, b);
		assertEquals(a + b, result, () -> a + " + " + b + " should equal " + (a + b));
	}

	// Explicit conversion using @MethodSource and custom converter
	@ParameterizedTest
	@MethodSource("stringToIntArguments")
	void testExplicitConversion(int convertedValue) {
		assertEquals(42, convertedValue, "Converted value should be 42");
	}

	// Provide test arguments with strings that need to be explicitly converted to
	// integers
	static Stream<Arguments> stringToIntArguments() {
		return Stream.of(Arguments.of("42"), Arguments.of("123"), Arguments.of("-7"));
	}

	// Custom argument converter for explicit conversion
	static class StringToIntegerConverter extends SimpleArgumentConverter {
		@Override
		protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
			assertEquals(String.class, source.getClass(), "Can only convert from String");
			assertEquals(Integer.class, targetType, "Can only convert to Integer");
			return Integer.valueOf((String) source);
		}
	}

	@Test
	void testNonParameterized() {
		// Additional non-parameterized test for explicit conversion
		StringToIntegerConverter converter = new StringToIntegerConverter();
		Integer convertedValue = (Integer) converter.convert("42", Integer.class);
		assertEquals(Integer.valueOf(42), convertedValue);
	}

	private int add(int a, int b) {
		return a + b;
	}

}
