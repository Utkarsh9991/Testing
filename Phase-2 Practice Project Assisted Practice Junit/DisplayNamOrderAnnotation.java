package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class DisplayNamOrderAnnotation {

//	Test Sign In page :
//
//
//		Username : enter the username
//
//		Password : enter the password
//
//		Sign In button :  click on sign in button
//
//		Forgot Password : OR enter usernmame

	@Order(3)
	@DisplayName("3. Test Sign In button")
	@Test
	public void method1() {

		System.out.println("Click on Sign In button");
	}

	@Order(1)
	@DisplayName("1. Test Username field")
	@Test
	public void method2() {

		System.out.println("Enter the username");
	}

	@Order(4)
	@DisplayName("4. Test Forgot Password Field")
	@Test
	public void method3() {

		System.out.println("Enter the usernmae in forgot password");

	}

	@Order(2)
	@DisplayName("2. Test Password field")
	@Test
	public void method4() {

		System.out.println("Enter the password");
	}

}
