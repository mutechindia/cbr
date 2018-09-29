package com.pp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.ProductDTO;
import com.pp.repositary.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository prorepo; 
public List productService(ProductDTO pro)
{  List<Integer> ints = new ArrayList<Integer>();
System.out.println("service"+ints);
return prorepo.productList(pro);

}
}
