package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedDemoCSVSource {

	// CSV => storing data in form of row and column like excel

	@ParameterizedTest(name = "CSV source {arguments}")
	@CsvSource({ "Audi ,  25", // row and column
			"BMW ,   24", "Volvo , 45", "Merc ,  50" })

	public void dataform_CSVsource(String car, String price) {

		System.out.println(car + "  :  " + price);

	}

}
