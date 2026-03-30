package com.bnp.sprbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.bnp.sprbootdemo.dto.ProductDto;
import com.bnp.sprbootdemo.entity.Product;
import com.bnp.sprbootdemo.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Value("${app.message}")
	private String message;

	@GetMapping("/profiles")
	public String getProfileInfo() {
		return message;

	}

	@PostMapping("/addProd")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto pr) {
		ProductDto prodDto = productService.createProduct(pr);
		return new ResponseEntity<ProductDto>(prodDto, HttpStatus.CREATED);
	}

	@GetMapping
	public List<ProductDto> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/{pid}")
	public ProductDto findProductById(@PathVariable("pid") Long id) {
		return productService.getProductById(id);
	}

	@PutMapping("/{id}")
	public ProductDto updateProduct(@PathVariable Long id, @RequestBody ProductDto prDto) {
		return productService.updateProduct(id, prDto);
	}

	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "Product with ID : " + id + " deleted successfully !!!";
	}

}
