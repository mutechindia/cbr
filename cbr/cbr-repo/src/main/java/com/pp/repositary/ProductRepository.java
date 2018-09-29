package com.pp.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.ProductDTO;

@Repository
public class ProductRepository {
	@Autowired
	HibernateTemplate hibernateTemplate;
public List productList(ProductDTO product)
{  
	hibernateTemplate.save(product);
	List list=hibernateTemplate.find("from ProductDTO");
	return list;
}
}
