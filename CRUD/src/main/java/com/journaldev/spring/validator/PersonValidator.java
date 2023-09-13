package com.journaldev.spring.validator;

import com.journaldev.spring.model.PersonModel;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    public boolean supports(Class candidate) {
        return PersonModel.class.isAssignableFrom (candidate);
    }
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace (
                errors,"name" , "required" , "Field is required." );
        ValidationUtils .rejectIfEmptyOrWhitespace (
                errors,"country" , "required" , "Field is required." );

    }
}