package com.pp.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.Product;
import com.pp.repo.ProductDAO;

@Service
public class ProductService implements com.pp.service.MasterProduct {
	@Autowired
	private ProductDAO productDAO;

	public void save(Product product) {
		productDAO.save(product);
	}

	public List getProduct(Product product) {
		return productDAO.getProduct(product);
	}

	
}
