package com.app.junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

//@IncludeTags({ "development" }) // execute those methods that have tag name as "development"
//@ExcludeTags({ "Prod" }) // execte those methods that do not have tag name as prod
public class IncludeExcludeTags {

	@Test
	@Tag("development")
	public void devtest1() {

		System.out.println("test case development1");
	}

	@Test
	@Tag("development")
	public void devTest2() {

		System.out.println("test case development2");
	}

	@Test
	@Tag("Qa")
	public void qaTest1() {

		System.out.println("test case for QA 1");
	}

	@Test
	@Tag("Qa")
	public void qaTest2() {

		System.out.println("test case for QA 2");
	}

	@Test
	@Tag("Prod")
	public void proTest1() {

		System.out.println("test case for production 1");
	}

	@Test
	@Tag("Prod")
	public void proTest2() {

		System.out.println("test case for production 2");
	}

}
