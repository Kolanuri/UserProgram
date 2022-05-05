package com.rest.webservice.user;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Date dateofbirth;
	
	protected User() {
	
	}
	
	
	public User(int id, String name, Date dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}
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
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dateofbirth=" + dateofbirth + "]";
	}
	
	
	
	

}
