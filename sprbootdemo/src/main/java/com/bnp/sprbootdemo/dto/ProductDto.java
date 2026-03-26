package com.bnp.sprbootdemo.dto;

public class ProductDto {

	private Long pid;
	private String pname;
	private int price;

	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDto(Long pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

}
