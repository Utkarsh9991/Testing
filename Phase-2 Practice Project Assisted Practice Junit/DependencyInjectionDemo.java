package com.app.junitDemo;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DependencyInjectionDemo {

	@org.junit.jupiter.api.RepeatedTest(5)
	public void repeattestDemo(TestInfo testInfo, RepetitionInfo repInfo) {

		System.out.println(testInfo.getDisplayName() + " " + repInfo.getCurrentRepetition());

	}

}
