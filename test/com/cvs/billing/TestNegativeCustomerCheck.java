package com.cvs.billing;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestNegativeCustomerCheck {
	
	static CustomerCheck customer = null;
	
	@BeforeClass
	public static void initialization() {
		System.out.println("Before Class");
		customer = new CustomerCheck();
	}
	
	
	@Test(expected = Exception.class)
	public void validateCustomer_ForInvalidAge() throws Exception{
		int age = 150;
		String state = "FL";
		System.out.println("validateCustomer_ForInvalidAge");
		customer.validateCustomer(state, age);
	}

}
