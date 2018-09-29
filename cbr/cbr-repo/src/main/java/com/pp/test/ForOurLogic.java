package com.pp.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class ForOurLogic {

	public static void main(String[] args) {

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeId(3);
		dto.setEmployeeName("amit");
		dto.setEmployeeGender("male");
		dto.setEmployeeAddress("indore");
		dto.setSalary(100000.2);
		session.save(dto);
		transaction.commit();
		session.close();
		factory.close();
	}

}
