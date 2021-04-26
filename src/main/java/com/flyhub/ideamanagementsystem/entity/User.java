package com.flyhub.ideamanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name= "password")
	private String password;
	
	
	public User() {
		super();
	}
	public User(String first_Name, String last_Name, String email, String password) {
		super();
		this.firstName = first_Name;
		this.lastName = last_Name;
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return firstName;
	}
	public void setFirst_Name(String first_Name) {
		this.firstName = first_Name;
	}
	public String getLast_Name() {
		return lastName;
	}
	public void setLast_Name(String last_Name) {
		this.lastName = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
