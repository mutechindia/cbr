package com.pp.repositary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.ProductDTO;

@Repository
public class ProductRepo {
	@Autowired
	HibernateTemplate temp;
public List productList(ProductDTO product)
{  
	temp.save(product);
	List list=temp.find("from ProductDTO");
	return list;
}
}
