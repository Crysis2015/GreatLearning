package com.greatlearning.emailapp.service;

import java.util.Random;

import com.greatlearning.emailapp.model.Employee;

public class CredentialServiceImpl implements CredentialService {
private String domain;


public CredentialServiceImpl(String domain) {
	super();
	this.domain = domain;
}

@Override
public String generateEmailId(String fname, String lname, String dept) {
	// TODO Auto-generated method stub
	return fname+lname+"@"+dept+"."+domain;
}

@Override
public char[] generatePassword(int length) {
	String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	String specialCharacters = "!@#$";
	String numbers = "1234567890";
	String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	Random random = new Random();
	char[] password = new char[length];

	password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	password[3] = numbers.charAt(random.nextInt(numbers.length()));

	for(int i = 4; i< length ; i++) {
		password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	}
	return password;
}

@Override
public void showCredentials(Employee e) {
System.out.println("Dear "+e.getFirstName()+ " Your generated credentials are as follows");
System.out.println("Email -->" +e.getEmailId());
System.out.println("Password-->"+e.getPassword());
	
}

}
