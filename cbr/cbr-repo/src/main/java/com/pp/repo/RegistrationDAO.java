package com.pp.repo;

import java.util.List;

import com.pp.model.Registration;

public interface RegistrationDAO {
	
	public void save(Registration registration) ;
	public List findByEmail(Registration registration); 
	}

