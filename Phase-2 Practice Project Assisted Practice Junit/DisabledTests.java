package com.app.junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Functinality is not working, ignoring the tests")
public class DisabledTests {

	@Test
	public void method1() {

		System.out.println("Executing mehtod-1");
	}

	@Test
	@Disabled
	public void method2() {

		System.out.println("Executing mehtod-2");
	}

	@Test
	@Disabled
	public void method3() {

		System.out.println("Executing mehtod-3");
	}

	@Test
	public void method4() {

		System.out.println("Executing mehtod-4");
	}

}
