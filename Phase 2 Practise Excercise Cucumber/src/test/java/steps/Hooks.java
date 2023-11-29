package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {

		System.out.println("This will run before the every step Hooks.java");
	}

	@After
	public void afterScenario() {

		System.out.println("This will run after the every step Hook.java");
	}

	@Before("@First,@Second")
	public void beforeFirst() {

		System.out.println("This will run only before the First Scenario");
	}

	@Before("@Second")
	public void beforeSecond() {

		System.out.println("This will run only before the Second Scenario");
	}

	@Before("@Third")
	public void beforeThird() {

		System.out.println("This will run only before the Third Scenario");
	}

	@After("@First")
	public void afterFirst() {

		System.out.println("This will run only before the First Scenario");
	}

	@After("@Second")
	public void afterSecond() {

		System.out.println("This will run only before the Second Scenario");
	}

	@After("@Third")
	public void afterThird() {

		System.out.println("This will run only before the Third Scenario");
	}

}
