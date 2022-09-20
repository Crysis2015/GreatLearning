package com.greatlearning.emailapp.service;

import com.greatlearning.emailapp.model.Employee;

public interface CredentialService {
public String generateEmailId(String fname, String lname, String dept);
public char[] generatePassword(int length);
public void showCredentials(Employee e);
}

