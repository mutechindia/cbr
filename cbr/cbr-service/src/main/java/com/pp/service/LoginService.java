package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pp.model.UserDTO;
import com.pp.repositary.LoginRepository;
import com.pp.repositary.irepositary.Login;

@Service
public class LoginService {
	@Autowired
//	@Qualifier("LoginRepository")
	private Login login;

	public List loginCheckService(UserDTO user) {
		List list = login.loginCheck(user);
		return list;
	}
}
