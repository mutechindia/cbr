package com.pp.repo.dao;

import com.pp.repo.dao.imp.HibernateCustomerDAO;

public class DAOFactory {
	static CustomerDAO customerDao;
	static {
		customerDao = new HibernateCustomerDAO();
	}

	public static CustomerDAO getCustomerDAO() {
		return customerDao;

	}
}
