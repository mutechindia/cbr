package com.pp.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.RegistrationDTO;

@Repository
public class RegistrationRepo {
	@Autowired
	HibernateTemplate temp1;

	public void reg_Save(RegistrationDTO reg) {
		temp1.save(reg);
	}

	public List findByEmail(RegistrationDTO reg) {
		List list = temp1.find("select dt.email from RegistrationDTO dt where dt.email=?", reg.getEmail() );
		return list;

	}

}
