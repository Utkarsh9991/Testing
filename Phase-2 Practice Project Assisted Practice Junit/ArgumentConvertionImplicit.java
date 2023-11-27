package com.app.junitDemo;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConvertionImplicit {

	// Junit will automatically convert the datatype of input source in to desired
	// datatype by test method
	// Souce=string
	// implicit convert to TimeUnit

	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void testwithImplicitArgumentConversion(ChronoUnit chronoUnit) {

		System.out.println(chronoUnit.name());
		Assertions.assertNotNull(chronoUnit.name());

	}

}
