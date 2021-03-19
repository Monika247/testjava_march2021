package com.demo.bean;

import java.util.Date;

public class Product {
	private static int count;
	static {
		count=1;
	}
	private int id;
	private String name;
	private String type;
	private Date mfgdate;
	private double price;
	
	public Product() {
		super();
	}

	public Product(int id, String name, String type, Date mfgdate,double price) {
		super();
		this.id = count++;
		this.name = name;
		this.type = type;
		this.mfgdate = mfgdate;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(Date mfgdate) {
		this.mfgdate = mfgdate;
	}
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", type=" + type + ", mfgdate=" + mfgdate + ", price=" + price
				+ "]";
	}

	
	
	

}
