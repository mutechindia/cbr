package com.pp.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.User;
import com.pp.repo.LoginDAO;
import com.pp.service.UserLogin;

@Service
public class LoginService implements UserLogin{
	@Autowired
//	@Qualifier("LoginRepository")
	private LoginDAO login;

	public boolean isUserRegister(User user) {
		   return login.isUserRegister(user);
	}
}
