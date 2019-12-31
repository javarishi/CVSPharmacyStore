package com.cvs.billing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCustomerCheck {

	static CustomerCheck customer = null;
	
	// Age > 18 -- Alcohol
	// Age > 21 -- Washington DC / NJ
	// Age > 15 -- has FL DL - allowed 
	
	@BeforeClass
	public static void initialization() {
		System.out.println("Before Class");
		customer = new CustomerCheck();
	}
	
	@AfterClass
	public static void destroy() {
		System.out.println("After Class");
		customer = null;
	}
	
	@Before
	public void beforeEveryTest() {
		System.out.println("This will execute Before Each test");
	}
	
	@After
	public void afterEveryTest() {
		System.out.println("This will execute After Each test");
	}
	
	@Test
	public void validateCustomer_ForAge18() throws Exception {
		int age = 18;
		String state = "TN";
		boolean expectedResult = true;
		System.out.println("validateCustomer_ForAge18");
		boolean actualResult = customer.validateCustomer(state, age);
		assertEquals(expectedResult, actualResult);
		assertTrue(actualResult);
	}
	
	@Test
	public void validateCustomer_ForAge21AndStateDC() throws Exception {
		int age = 21;
		String state = "DC";
		boolean expectedResult = true;
		System.out.println("validateCustomer_ForAge21AndStateDC");
		boolean actualResult = customer.validateCustomer(state, age);
		assertEquals(expectedResult, actualResult);
		assertTrue(actualResult);
	}
	
	@Test
	public void validateCustomer_ForAge21AndStateNJ() throws Exception {
		int age = 21;
		String state = "NJ";
		boolean expectedResult = true;
		System.out.println("validateCustomer_ForAge21AndStateNJ");
		boolean actualResult = customer.validateCustomer(state, age);
		assertEquals(expectedResult, actualResult);
		assertTrue(actualResult);
		
	}
	
	@Test
	public void validateCustomer_ForAge15AndStateFL() throws Exception {
		int age = 15;
		String state = "FL";
		boolean expectedResult = true;
		System.out.println("validateCustomer_ForAge15AndStateFL");
		boolean actualResult = customer.validateCustomer(state, age);
		assertEquals(expectedResult, actualResult);
		assertTrue(actualResult);
	}
	
	
	
	
	
}
