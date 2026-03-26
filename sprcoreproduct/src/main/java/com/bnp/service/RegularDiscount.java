package com.bnp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service

public class RegularDiscount  implements DiscountService{

	@Override
	public void applyDiscount() {
		System.out.println("Regular Discount Applied : 10%");
		
	}

}
