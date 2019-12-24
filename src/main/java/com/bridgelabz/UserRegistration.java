package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    Pattern namePattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
    public boolean firstNameValidation(String firstName) {

        return namePattern.matcher(firstName).matches();

    }

    public boolean lastNameValidation(String lastName) {
        return namePattern.matcher(lastName).matches();
    }
}
