package com.bnp.repository;

import org.springframework.stereotype.Repository;

import com.bnp.entity.Product;

@Repository
public class ProductRepository {
	
	public Product getProduct() {
		
		Product prod = new Product();
		prod.setPid(1000);
		prod.setPname("iphone");
		
		return prod;
	}
}
