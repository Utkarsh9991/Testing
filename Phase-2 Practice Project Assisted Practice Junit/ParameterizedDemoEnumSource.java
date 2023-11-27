package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParameterizedDemoEnumSource {

	enum Values {

		Selenium, Jmeter, Junit, TestNG

	}

	@ParameterizedTest(name = "Enum value {arguments}")
	@EnumSource(Values.class)
	public void passvaluesEnumSource(Object value) {

		System.out.println(value.toString());
	}

}
