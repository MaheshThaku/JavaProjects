
//2.Create a class Address---hno,area,city
package com.spring;

public class Address {
	private String hno;
	private String area;
	private String city;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
	}

	public Address(String hno, String area, String city) {
		super();
		this.hno = hno;
		this.area = area;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", area=" + area + ", city=" + city + "]";
	}

}
