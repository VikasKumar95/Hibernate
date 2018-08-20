package com.qualde.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Contract_con")
/*@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
})*/
public class ContractEmployee extends Employee{
	
	private int pay;
	private int duration;
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "ContractEmployee [pay=" + pay + ", duration=" + duration + "]";
	}

	
	
}
