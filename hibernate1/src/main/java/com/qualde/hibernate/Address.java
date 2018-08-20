package com.qualde.hibernate;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	private int hno;
	private String city;
	private String country;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", country=" + country + "]";
	}
	
	
	
	
	

}
