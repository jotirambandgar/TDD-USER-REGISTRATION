package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public boolean firstNameValidation(String firstName) {
        String firstNamePattern="^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(firstName).find();

    }
}
