package com.pp.repo.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.Product;
import com.pp.repo.ProductDAO;

@Repository
public class ProductDAOImp implements ProductDAO {
	@Autowired
	HibernateTemplate temp;

	public void save(Product product) {
		temp.save(product);

	}

	public List getProduct(Product product) {
		List list = temp.find("from Product");
		return list;
	}
}
