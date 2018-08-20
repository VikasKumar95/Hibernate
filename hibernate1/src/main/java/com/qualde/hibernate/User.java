package com.qualde.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	private int uid;
	private String name;
	private int marks;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="hno")
	private Address address;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	private List<Laptop> laptops=new ArrayList<>();
	
	
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", marks=" + marks + ", address=" + address 
				 + "]";
	}
	
	
}
