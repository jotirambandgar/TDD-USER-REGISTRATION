package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    private Pattern pattern;

    public boolean firstNameValidation(String firstName) {

        pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(firstName).matches();

    }

    public boolean lastNameValidation(String lastName) {

        pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        return pattern.matcher(lastName).matches();
    }


    public boolean emailIdValidation(String emailId) {
        pattern = Pattern.compile("[A-Za-z0-9]{2,}([.][A-Za-z0-9]{2,})?[@][A-Za-z]{1,}[.][a-zA-z]{2,4}");
        return pattern.matcher(emailId).matches();
    }

    public boolean mobileNumberValidation(String mobileNumber) {
        pattern = Pattern.compile("^91\\s[0-9]{10}$");
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean passworValidation(String password) {
        pattern =Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[-_.#@/]{2}([a-z]?).{8,}$");
        return pattern.matcher(password).matches();
    }
}
