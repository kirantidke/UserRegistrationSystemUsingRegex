package com.bridgelabz.rejex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
	public static void main(String[] args) {
		Validator validator = new Validator();
		validator.firstName();
		validator.lastName();
		validator.emailId();
		validator.mobileNumber();
		validator.password();
	}
}
