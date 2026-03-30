package com.bnp.sprbootdemo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnp.sprbootdemo.dto.ProductDto;
import com.bnp.sprbootdemo.entity.Product;
import com.bnp.sprbootdemo.exeception.ProductNotFoundException;
import com.bnp.sprbootdemo.mapper.ProductMapper;
import com.bnp.sprbootdemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDto createProduct(ProductDto prDto) {
		Product prod = ProductMapper.toEntity(prDto);
		return ProductMapper.toDto(productRepository.save(prod));
	}

	@Override
	public List<ProductDto> getAllProducts() {

		return productRepository.findAll().stream().map(ProductMapper::toDto).collect(Collectors.toList());
	}

	@Override
	public ProductDto getProductById(Long id) {
		Product prod = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product", "ProductID", id));
		return ProductMapper.toDto(prod);
	}

	@Override
	public ProductDto updateProduct(Long id, ProductDto prDto) {
		Product prod = productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product", "ProductID", id));

		prod.setPname(prDto.getPname());
		prod.setPrice(prDto.getPrice());
		return ProductMapper.toDto(productRepository.save(prod));
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);

	}

}
