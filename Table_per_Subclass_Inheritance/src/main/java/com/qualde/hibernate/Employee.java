package com.qualde.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Employee_Concrete")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee{
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}