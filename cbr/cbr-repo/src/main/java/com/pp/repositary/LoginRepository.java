package com.pp.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.UserDTO;
import com.pp.repositary.irepositary.Login;

@Repository
public class LoginRepository implements Login {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public List loginCheck(UserDTO user) {
		List list = hibernateTemplate.find("select email from RegistrationDTO where email=?",user.getEmail());
		return list;
    }
	}

