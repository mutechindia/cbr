package com.pp.service;

import java.util.List;

import com.pp.model.Product;

public interface MasterProduct {
	public void save(Product product);
	public List getProduct(Product product);
}
