package com.bnp.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bnp.exception.ProductNotFoundException;
import com.bnp.model.Product;
import com.bnp.util.FileUtil;

public class ProductDao {

	static String filePath = "mydir/products.txt";

	public void saveProduct(Product p) {
		String data = p.getPid() + "," + p.getPname();
		FileUtil.writeProduct(data);
		System.out.println("Product Saved to File...");
	}

	public void showProduct() {
		FileUtil.readProduct();

	}

	public Product findProductById(int id) throws ProductNotFoundException {

		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int pid = Integer.parseInt(data[0]);
				String pname = data[1];

				if (pid == id) {
					return new Product(pid, pname);
				}

			}
			br.close();
		} catch (NumberFormatException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		throw new ProductNotFoundException("PRoduct with ID : " + id + " not Found...");
	}
	
	
	public List<Product> getAllProducts(){
		
		
	
		List<Product> prList=new ArrayList<>();
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int pid = Integer.parseInt(data[0]);
				String pname = data[1];
				prList.add(new Product(pid,pname));
				
			
}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prList;

}
}
