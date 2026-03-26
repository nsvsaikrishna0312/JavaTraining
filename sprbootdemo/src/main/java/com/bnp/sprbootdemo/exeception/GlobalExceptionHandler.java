package com.bnp.sprbootdemo.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bnp.sprbootdemo.util.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiResponse> myProductNotFound(ProductNotFoundException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message, HttpStatus.NOT_FOUND.toString());
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
}
