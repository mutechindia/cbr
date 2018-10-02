package com.pp.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.User;
import com.pp.repo.LoginDAO;

@Component
public class LoginValidator implements Validator {
	@Autowired
	private LoginDAO dao;

	@Override
	public boolean supports(Class<?> cls) {

		return User.class.isAssignableFrom(cls);
	}
	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		ValidationUtils.rejectIfEmpty(errors, "email", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		
		if (user.getEmail().trim().length()>0)
		{   
			if(dao.isUserRegister(user)!=true){
				errors.rejectValue("email", "error.email.second.rule");
			}
		}
	}

}
