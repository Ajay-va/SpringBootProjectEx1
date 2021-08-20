package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filpkart")
public class FilpKart {

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer fid;

	@Column(name="name")
	private String fName;

	@Column(name="mobile")
	private String fmobile;

	@Column(name="gmail")
	private String fgmail;
	public FilpKart() {
		super();
	}
	public FilpKart(Integer fid, String fName, String fmobile, String fgmail) {
		super();
		this.fid = fid;
		this.fName = fName;
		this.fmobile = fmobile;
		this.fgmail = fgmail;
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getFmobile() {
		return fmobile;
	}
	public void setFmobile(String fmobile) {
		this.fmobile = fmobile;
	}
	public String getFgmail() {
		return fgmail;
	}
	public void setFgmail(String fgmail) {
		this.fgmail = fgmail;
	}
	@Override
	public String toString() {
		return "FilpKart [fid=" + fid + ", fName=" + fName + ", fmobile=" + fmobile + ", fgmail=" + fgmail + "]";
	}
	
	

}
