
//3.create a class Student---sid,sname,List<Book> blist,Address address
package com.spring;

import java.util.List;

public class Student {
	private int sid;
	private String sname;
	private List<Book> blist;
	private Address address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Book> getBlist() {
		return blist;
	}
	public void setBlist(List<Book> blist) {
		this.blist = blist;
	}
	public Student() {
		super();
	}
	public Student(int sid, String sname, List<Book> blist, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.blist = blist;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", blist=" + blist + ", address=" + address + "]";
	}
	
	
}
