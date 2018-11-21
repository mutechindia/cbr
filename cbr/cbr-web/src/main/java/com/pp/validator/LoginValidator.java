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
		ValidationUtils.rejectIfEmpty(errors, "userEmailID", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "userPassword", "error.password.empty");
		
		if (user.getUserEmailID().trim().length()>0)
		{   
			if(dao.isUserRegister(user)!=true){
				errors.rejectValue("userEmailID", "error.email.second.rule");
			}
		}
	}

}
