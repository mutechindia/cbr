package com.pp.repo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.User;
import com.pp.repo.LoginDAO;
@Repository
public class LoginDAOImp implements LoginDAO{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public boolean isUserRegister(User user) {
		
		List list = hibernateTemplate.find("select email from Registration where email=?", user.getEmail());
		if (list.size() >= 1) {
			return true;
		} else {
			return false;
		}
	}
}

