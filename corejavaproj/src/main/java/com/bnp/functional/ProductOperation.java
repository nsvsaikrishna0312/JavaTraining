package com.bnp.functional;

import com.bnp.model.Product;

@FunctionalInterface
public interface ProductOperation{
	public void perform(Product pr);
	public default void printHeader() {
		System.out.println("****Start****");
			
	}
	public default void printfooter() {
		System.out.println("****End****");
			
	}
}










//
//@FunctionalInterface
//interface Maths{
//	public void add(int a,int b);
//	public default void sub(int a ,int b) {
//		System.out.println("*********");
//	}
//}
//
//
//public class ProductOperation {
//	public static void main(String args[]) {
//		ProductOperation pops=new ProductOperation();
//		
//	
//
//
//	Maths c=( a, b)->{
//		System.out.println(a+b);
//		
//	};
//	
//	c.add(78,2);
//	}
//	
//	
////	@Override
////	public void sub(int a, int b) {
////		System.out.println(a-b);
////	}
//
//}
