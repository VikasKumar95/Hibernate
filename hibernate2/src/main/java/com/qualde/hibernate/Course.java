package com.qualde.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Course {
	
	@Id
	private int cid;
	private String cname;
	private int fees;
	
	/*@ManyToMany(cascade=CascadeType.ALL)
	private List<User> userList=new ArrayList<>();
*/
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	/*public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}*/

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", fees=" + fees + "]";
	}
	
	
	
	
	
	
	
}
