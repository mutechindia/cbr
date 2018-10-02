package com.pp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.Product;
import com.pp.service.MasterProduct;


@Controller
public class ProductController {
	@Autowired
	private MasterProduct masterProduct;
	
	@RequestMapping(value = "/product", method = { RequestMethod.POST, RequestMethod.GET })
	public String showProductEnter(@ModelAttribute("Product") Product product, Map<Object, Object> map,
			HttpServletRequest ht) {
		System.out.println("product");
		if (ht.getMethod().equals("GET")) {
			Product newProduct = new Product();
			map.put("Product", newProduct);
			return "product";
		} else {
			List list= masterProduct.getProduct(product);
			map.put("key",list);
			return "product";
		}
	}

	/*
	@RequestMapping(value = "/submit", method = { RequestMethod.POST, RequestMethod.GET })
	public String showProductEnter(@ModelAttribute("ProductDTO") ProductDTO pro, HttpServletRequest ht) {
		System.out.println("product submit");
		if (ht.getMethod().equals("POST")) {
			System.out.println("product submit");
			List l = prorepo.productList(pro);
			Iterator itr = l.iterator();
			while (itr.hasNext()) {
				ProductDTO pr = (ProductDTO) itr.next();
				System.out.println(pr.getProductname() + " " + pr.getProductdec());
			}
			return "product";
		} else
			return "success";
	}*/
}