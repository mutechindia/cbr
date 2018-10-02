package com.pp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pp.model.Address;
import com.pp.model.User;

public class Test {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		User user = new User();
		//user.setUserId(1);// autogenrated
		user.setUserName("gourav");
		user.setUserEmailID("@gmail.com");
		user.setUserPassword("**********");
		Address addess = new Address();
		//addess.setAddressId(1);
		addess.setAddressLine1("INDORE");
		addess.setAddressLine2("");
		addess.setAddressLine3("");
		addess.setAddressLine4("");
		addess.setCity("");
		addess.setCountry("");
		addess.setState("");		
		
		user.setUserAddress(addess);

		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();

	}

}
