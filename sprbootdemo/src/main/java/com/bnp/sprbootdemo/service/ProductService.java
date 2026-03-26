package com.bnp.sprbootdemo.service;

import java.util.List;

import com.bnp.sprbootdemo.dto.ProductDto;
import com.bnp.sprbootdemo.entity.Product;

public interface ProductService {
	
	public ProductDto createProduct(ProductDto pr);
	public List<ProductDto> getAllProducts();
	public ProductDto getProductById(Long id);
	public ProductDto updateProduct(Long id , ProductDto pr);
	public void deleteProduct(Long id);

}
