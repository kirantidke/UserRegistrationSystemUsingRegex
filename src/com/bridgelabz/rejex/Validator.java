package com.bridgelabz.rejex;

import java.util.Scanner;

public class Validator {
	Scanner sc = new Scanner(System.in);

	RejexValidation regexValidation = new RejexValidation();

	public String firstName() {
		
		System.out.println();
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		boolean result = regexValidation.validate(firstName);
		if (result) {
			System.out.println("valid name");
			return firstName;
		} else {
			System.out.println("Name is not valide \n Enter Correct Name");
			return firstName();
		}
	}
}
