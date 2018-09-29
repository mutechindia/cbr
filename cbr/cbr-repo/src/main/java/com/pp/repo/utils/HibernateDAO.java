package com.pp.repo.utils;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface HibernateDAO {
	public Session getSesson();
	public Transaction getTransaction();

}
