package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchasetab")
public class Purchase {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer pid;

	@Column(name="name")
	private String pname;

	@Column(name="details")
	private String pdetails;

	@Column(name="quantity")
	private String pquantity;
	public Purchase() {
		super();
	}
	public Purchase(Integer pid, String pname, String pdetails, String pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdetails = pdetails;
		this.pquantity = pquantity;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdetails() {
		return pdetails;
	}
	public void setPdetails(String pdetails) {
		this.pdetails = pdetails;
	}
	public String getPquantity() {
		return pquantity;
	}
	public void setPquantity(String pquantity) {
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Purchase [pid=" + pid + ", pname=" + pname + ", pdetails=" + pdetails + ", pquantity=" + pquantity
				+ "]";
	}
	
	
	
	
}
