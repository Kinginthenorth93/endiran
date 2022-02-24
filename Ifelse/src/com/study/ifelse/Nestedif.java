package com.study.ifelse;

public class Nestedif {
	public static void main(String[] args) {
		String havingAccountNumber = "SBI1234";
		int MinimumBalance = 20000;
		Boolean havingminimumbalance = true;
		
		if(havingAccountNumber.startsWith("SBI1234")) {
			if(MinimumBalance>=20000) {
				if(havingminimumbalance) {
					System.out.println("you are eligible for credit card");
				} else {
					System.out.println("you are not having minimum balance");
				}
			}	else {
					System.out.println("your balance is less than 20000");
			}

					} else {
					System.out.println("your account number is wrong");
				}
			}
		}



