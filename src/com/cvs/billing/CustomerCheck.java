package com.cvs.billing;

public class CustomerCheck {

	
	// Age > 18 -- Alcohol
	// Age > 21 -- Washington DC / NJ
	// Age > 15 -- has FL DL - allowed 
	
	public boolean validateCustomer(String stateId, int age) throws Exception {
		boolean result = false; 
		if(stateId != null && !stateId.isEmpty() && age > 7 && age < 121) {
			if(stateId.equalsIgnoreCase("DC") || stateId.equalsIgnoreCase("NJ")) {
				if(age >= 21) {
					result = true;
				}
			}else if(stateId.equalsIgnoreCase("FL")) {
				if(age >= 15) {
					result = true;
				}
			}else {
				if(age >= 18) {
					result = true;
				}
			}
		}else {
			throw new Exception("Invalid Customer Inputs :: " + stateId + " Age :: " + age);
		}
		return result;
	}
}
