package com.example.utils;

import java.util.Random;

public class TestUtils {

	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}
}
/*
*
* Here is the details of the Automation Project
This is a Banking Project where the customer
should be able to withdraw funds from the account

Your code should include the following:
- BDD Framework
- Validate the current Balance after withdrawal
- Make Deposit into the account
- using the relevant library for the http client
- no hard coding
*
* */