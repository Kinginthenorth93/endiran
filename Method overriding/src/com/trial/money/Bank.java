package com.trial.money;

public class Bank {
	String bankbranch="nagar";
	String ifsccode="IDIB000124";
	int noofbranches=100;
	
	public Bank() {
		
	}
	
	public Object rateofintresetforloan() {
		return"12.05%"; 
	}

	@Override
	public boolean equals(Object bank) {
		if(bank instanceof Bank) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	
	
}
