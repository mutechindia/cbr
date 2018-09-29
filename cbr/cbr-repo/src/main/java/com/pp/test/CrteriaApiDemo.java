package com.pp.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CrteriaApiDemo {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Query query =session.createQuery("from EmployeeDTO");
		query.setFirstResult(1);
		query.setFirstResult(2);
		List <EmployeeDTO>list=query.list();
		for(EmployeeDTO pro : list)
		{
			System.out.println(pro.getEmployeeName());
		}
		
		Criteria cr = session.createCriteria(Product.class);
		// To get records having salary more than 2000
		cr.add(Restrictions.gt("salary", 2000));

		// To get records having salary less than 2000
		cr.add(Restrictions.lt("salary", 2000));

		// To get records having fistName starting with zara
		cr.add(Restrictions.like("firstName", "zara%"));

		// Case sensitive form of the above restriction.
		cr.add(Restrictions.ilike("firstName", "zara%"));

		// To get records having salary in between 1000 and 2000
		cr.add(Restrictions.between("salary", 1000, 2000));

		// To check if the given property is null
		cr.add(Restrictions.isNull("salary"));

		// To check if the given property is not null
		cr.add(Restrictions.isNotNull("salary"));

		// To check if the given property is empty
		cr.add(Restrictions.isEmpty("salary"));

		// To check if the given property is not empty
		cr.add(Restrictions.isNotEmpty("salary"));
		
		Criteria crr = session.createCriteria(EmployeeDTO.class);

		Criterion salary = Restrictions.gt("salary", 2000);
		Criterion name = Restrictions.ilike("firstNname","zara%");

		// To get records matching with OR conditions
		LogicalExpression orExp = Restrictions.or(salary, name);
		cr.add( orExp );

		// To get records matching with AND conditions
		LogicalExpression andExp = Restrictions.and(salary, name);
		cr.add( andExp );

		List results = crr.list();
		
		Criteria crrr = session.createCriteria(EmployeeDTO.class);

		// To get records having salary more than 2000
		crrr.add(Restrictions.gt("salary", 2000));

		// To sort records in descening order
		crrr.addOrder(Order.desc("salary"));

		// To sort records in ascending order
		crrr.addOrder(Order.asc("salary"));

		List resultss = cr.list();
		
		Criteria crrrr = session.createCriteria(EmployeeDTO.class);

		// To get total row count.
		cr.setProjection(Projections.rowCount());

		// To get average of a property.
		cr.setProjection(Projections.avg("salary"));

		// To get distinct count of a property.
		cr.setProjection(Projections.countDistinct("firstName"));

		// To get maximum of a property.
		cr.setProjection(Projections.max("salary"));

		// To get minimum of a property.
		cr.setProjection(Projections.min("salary"));

		// To get sum of a property.
		cr.setProjection(Projections.sum("salary"));

	}

}
