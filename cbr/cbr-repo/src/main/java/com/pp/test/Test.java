package com.pp.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		Session session1 = factory.openSession();

		Transaction tx = null;
		String hql = "Select u.userName,d.addressLine1 FROM User u, Address d where u.userId=d.addressId";
		Query query = session.createQuery(hql);
		List results = query.list();
		Iterator it=results.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());	
		}
			
		User user = new User();
		// user.setUserId(1);// autogenrated
		user.setUserName("gourav");
		user.setUserEmailID("@gmail.com");
		user.setUserPassword("**********");
		Address addess = new Address();
		// addess.setAddressId(1);
		addess.setAddressLine1("INDORE");
		addess.setAddressLine2("");
		addess.setAddressLine3("");
		addess.setAddressLine4("");
		addess.setCity("");
		addess.setCountry("");
		addess.setState("");

		user.setUserAddress(addess);

		User user1 = new User();
		// user.setUserId(1);// autogenrated
		user1.setUserName("gourav");
		user1.setUserEmailID("@gmail.com");
		user1.setUserPassword("**********");
		Address addess1 = new Address();
		// addess.setAddressId(1);
		addess1.setAddressLine1("INDORE");
		addess1.setAddressLine2("");
		addess1.setAddressLine3("");
		addess1.setAddressLine4("");
		addess1.setCity("");
		addess1.setCountry("");
		addess1.setState("");

		user1.setUserAddress(addess1);
		try {
			tx = session.beginTransaction();
			// do some work
			session.save(user);
			session1.save(user1);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
