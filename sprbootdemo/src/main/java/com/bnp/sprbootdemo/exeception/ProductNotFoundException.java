package com.bnp.sprbootdemo.exeception;

public class ProductNotFoundException extends RuntimeException {

	private String resourceName;
	private String fieldName;
	private Long fieldValue;

	public ProductNotFoundException(String message) {
		super(message);

	}

	public ProductNotFoundException(String resourceName, String fieldName, Long fieldValue) {
		super(String.format("%s NOT FOUND with  %s :  %d",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}
