package com.cvs.billing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = { TestCustomerCheck.class, 
			TestNegativeCustomerCheck.class,
		})
public class TestSuite {

	
}
