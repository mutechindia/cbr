package com.pp.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.UserDTO;
import com.pp.repositary.LoginRepository;

@Component
public class LoginValidator implements Validator {
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public boolean supports(Class<?> cls) {

		return UserDTO.class.isAssignableFrom(cls);
	}
	@Override
	public void validate(Object target, Errors errors) {
		UserDTO user = (UserDTO) target;
		ValidationUtils.rejectIfEmpty(errors, "email", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		
		if (user.getEmail().trim().length()>0)
		{   
			if(loginRepository.loginCheck(user).size()==0){
				errors.rejectValue("email", "error.email.second.rule");
			}
		}
	}

}
