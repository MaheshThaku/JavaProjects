//@Mahesh Thakur
//1.Create a class Book---bid,bname,price
package com.spring;

public class Book {
	private int bid;
	private String bname;
	private String price;	
	static int counter=1;
	
	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Book() {
		super();
	}


	public Book(int bid, String bname, String price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book-"+(counter++)+ " [bis=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}
	
}
