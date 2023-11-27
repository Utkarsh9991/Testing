package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

	@RepeatedTest(5)
	@DisplayName("Repeated Test Methods")
	public void repeatmessage() {

		System.out.println("We are learning JUnit..");
	}

	@Test
	public void AssumptionDemo() {

		boolean isDBServerUp = true;

		// Assumptions is a collection of utility methods that support conditional test
		// execution based on assumptions.

		Assumptions.assumeTrue(isDBServerUp, "DB Server is not UP & Running..");

		System.out.println("Create the table and insert data..");
	}

}
