package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooksDemo {

	@Before(order = 0, value = "@regression")
	public void setup() {

		System.out.println("Executing only regression scenarios");
		System.out.println("The feature sceanrio has started");

	}

	@Before(order = 1, value = "@db")
	public void DBsetup() {

		System.out.println("Connect to DB");
	}

	@After(order = 2, value = "@db")
	public void DBClose() {

		System.out.println("Close the DB connection");
	}

	@After(order = 3, value = "@regression")
	public void teardown() {

		System.out.println("The feature scenario has completed");
	}

}
