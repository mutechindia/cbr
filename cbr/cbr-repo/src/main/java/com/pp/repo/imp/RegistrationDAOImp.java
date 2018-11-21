package com.pp.repo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.Registration;
import com.pp.repo.RegistrationDAO;

@Repository
public class RegistrationDAOImp implements RegistrationDAO {
	@Autowired
	HibernateTemplate hibernateTemplate;

	public List findByEmail(Registration registration) {
		List list = hibernateTemplate.find("select dt.regEmail from Registration dt where dt.regEmail=?", registration.getRegEmail() );
		return list;

	}

	public void save(Registration registration) {
		hibernateTemplate.save(registration);		
	}

}
