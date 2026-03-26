package com.bnp.ccontroller;

import java.util.List;

import com.bnp.dao.ProductDao;
import com.bnp.exception.ProductNotFoundException;
import com.bnp.model.Product;

public class ProductController {

	Product pr;
	ProductDao dao = new ProductDao();

	public void addProduct(Product p) {
		this.pr = p;
		dao.saveProduct(p);
		System.out.println("Product Added...");
	}

	public void viewProduct() {
		// System.out.println(pr.getPid() + " -- " + pr.getPname());
		dao.showProduct();
	}

	public Product searchProductById(int id) throws ProductNotFoundException {

		return dao.findProductById(id);
	}
	
	public List<Product> getAllProducts(){
		return dao.getAllProducts();
	}

}
