package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Invoice {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	@Column(name="data")
	private String data;
	@Column(name="code")
	private Double code;
	public Invoice() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Double getCode() {
		return code;
	}
	public void setCode(Double code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", data=" + data + ", code=" + code + "]";
	}
	
	
	
	

}
