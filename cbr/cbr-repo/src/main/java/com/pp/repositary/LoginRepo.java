package com.pp.repositary;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.RegistrationDTO;
import com.pp.model.UserDTO;
@Repository
public class LoginRepo{
	@Autowired
	HibernateTemplate temp;
	public void loginRepo(UserDTO user) {
		System.out.println("repositary");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		List list = temp.find("from RegistrationDTO");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			RegistrationDTO reg = (RegistrationDTO) itr.next();
			System.out.println(reg.getEmail());
		}

	}
}
