package com.qualde.hibernate;

import javax.persistence.*;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	private User user;
	
	public Laptop() {
		
	}
	

	public Laptop(int lid, String name) {
		super();
		this.lid = lid;
		this.name = name;

	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", name=" + name  + "]";
	}
	
	
	

}
