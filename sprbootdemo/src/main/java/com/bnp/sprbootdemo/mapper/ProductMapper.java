package com.bnp.sprbootdemo.mapper;

import com.bnp.sprbootdemo.dto.ProductDto;
import com.bnp.sprbootdemo.entity.Product;

public class ProductMapper {

	public static Product toEntity(ProductDto dto) {
		Product p = new Product();
		p.setPid(dto.getPid());
		p.setPname(dto.getPname());
		p.setPrice(dto.getPrice());
		return p;
	}

	public static ProductDto toDto(Product pr) {
		ProductDto dto = new ProductDto();
		dto.setPid(pr.getPid());
		dto.setPname(pr.getPname());
		dto.setPrice(pr.getPrice());
		return dto;
	}
}
