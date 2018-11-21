package com.pp.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pp.model.Registration;
import com.pp.repo.RegistrationDAO;

@Component
public class RegistrationValidator implements Validator {
	@Autowired
	private RegistrationDAO regrepo;

	@Override
	public boolean supports(Class<?> cls) {

		return Registration.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Registration reg = (Registration) target;
		ValidationUtils.rejectIfEmpty(errors, "regType", "error.type.empty");
		ValidationUtils.rejectIfEmpty(errors, "regName", "error.name.empty");
		ValidationUtils.rejectIfEmpty(errors, "regEmail", "error.emailId.empty");
		ValidationUtils.rejectIfEmpty(errors, "userName", "error.username.empty");
		ValidationUtils.rejectIfEmpty(errors, "userPassword", "error.password.empty");

		if (reg.getRegEmail().trim().length() > 0 && reg.getRegEmail().length() > 0) {
			if (regrepo.findByEmail(reg).size() > 0) {
				errors.rejectValue("regEmail", "error.email.first.rule");
			}
		}
	}

}
