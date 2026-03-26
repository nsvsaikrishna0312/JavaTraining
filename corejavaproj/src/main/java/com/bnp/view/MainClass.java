package com.bnp.view;

import java.util.List;
import java.util.Scanner;

import com.bnp.ccontroller.ProductController;
import com.bnp.exception.ProductNotFoundException;
import com.bnp.functional.ProductOperation;
import com.bnp.model.Product;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome");
		ProductController pc = new ProductController();
		Scanner sc = new Scanner(System.in);
		String continueChoice = null;
		do {

		System.out.println("1. Add Product");
		System.out.println("2. View Product");
		System.out.println("3. Search Product  By ID");
		System.out.println("Enter Choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		{
			System.out.println("Enter id");
			int id = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
		
			Product p = new Product(id, name);
			//p.setPid(id);
			//p.setPname(name);
			
			pc.addProduct(p);
			break;

		}
		case 2:
		{
			pc.viewProduct();
			break;

		}
		case 3:
		{
			System.out.println("Enter id");
			int id = sc.nextInt();
			try {
				Product pr= pc.searchProductById(id);
				System.out.println(pr.getPid() + " -- -- -- " + pr.getPname());
			} catch (ProductNotFoundException e) {
				
				e.printStackTrace();
			}
			break;

		}
		case 4:
		{
			List<Product> plist=pc.getAllProducts();
			
			ProductOperation ops=(pr)->{
				System.out.println(pr.getPid()+"-- -- --"+pr.getPname());
				
			};
			ops.printHeader();
			
			plist.forEach(pr->System.out.println(pr));
			ops.printfooter();
			break;
			
			
		}
		
		default:
			break;
		}
		System.out.println("Do u wanna continue? Y | y");
		continueChoice = sc.next();
		}while(continueChoice.equals("Y") || continueChoice.equals("y"));

		System.out.println("Thanks for using the system");
	}

}
