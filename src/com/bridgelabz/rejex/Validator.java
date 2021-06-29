package com.bridgelabz.rejex;

import java.util.Scanner;

public class Validator {
	Scanner sc = new Scanner(System.in);

	RejexValidation regexValidation = new RejexValidation();

	public String firstName() {
		
		System.out.println();
		System.out.println("Enter First Name:");
		String firstName = sc.nextLine();
		boolean result = regexValidation.validateFirstName(firstName);
        if (result) {
			System.out.println("valid first name");
			return firstName;
		} else {
			System.out.println("Name is not valide \n Enter Correct Name");
			return firstName();
		}
	}
	  public String lastName(){
	        System.out.println("Enter Last Name:");
	        String lastName = sc.nextLine();
	        boolean result = regexValidation.validateLastName(lastName);
	        if (result) {
	            System.out.println("Valid last name");
	            return lastName;
	        }else {
	            System.out.println("Last Name is not valide, Enter Correct Name");
	            return lastName();
	        }
	    }
}
