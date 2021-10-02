package com.cg.project.fooddeliveryapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Login")
public class Login 
{
	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String userId;
	private String userName;
	private String password;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login(String userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
