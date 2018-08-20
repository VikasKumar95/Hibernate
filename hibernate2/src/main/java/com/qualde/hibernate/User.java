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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="user_course",joinColumns=@JoinColumn(name="uid",referencedColumnName="uid")
	,inverseJoinColumns=@JoinColumn(name="cid",referencedColumnName="cid"))
	private List<Course> courseList=new ArrayList<>();

	
	
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

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", marks=" + marks + ", courseList=" + courseList + "]";
	}
	
	
	
	
	
}
