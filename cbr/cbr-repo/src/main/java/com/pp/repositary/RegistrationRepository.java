package com.pp.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.RegistrationDTO;
import com.pp.model.UserDTO;

@Repository
public class RegistrationRepository {
	@Autowired
	HibernateTemplate  hibernateTemplate;

	public void registrationSave(RegistrationDTO reg) {
		hibernateTemplate.save(reg);
	}
	public List findByEmail(RegistrationDTO reg) {
		System.out.println("registration epo");
		List list = hibernateTemplate.find("select dt.email from RegistrationDTO dt where dt.email=?", reg.getEmail() );
		return list;

	}
	

}
