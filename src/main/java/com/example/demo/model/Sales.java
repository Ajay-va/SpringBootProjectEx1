package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="saletab")
public class Sales {

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer sid;
	@Column(name="name")
	private String sname;
	@Column(name="phone")
	private Double sphone;
	
	
	
	public Sales() {
		super();
	}



	public Integer getSid() {
		return sid;
	}



	public void setSid(Integer sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public Double getSphone() {
		return sphone;
	}



	public void setSphone(Double sphone) {
		this.sphone = sphone;
	}



	@Override
	public String toString() {
		return "Sales [sid=" + sid + ", sname=" + sname + ", sphone=" + sphone + "]";
	}
	
	
	
	
	
}
