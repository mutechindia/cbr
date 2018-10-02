package com.pp.repo;

import java.util.List;

import com.pp.model.Product;

public interface ProductDAO {
	
	public void save(Product product);
	public List getProduct(Product product);
	
}
