package com.hw.sec.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int age;
	private String pw;
	private String auth;
	
	
	
	public Employee() {
	}

	


	public Employee(String name, int age, String pw,String auth) {
		super();
		this.name = name;
		this.age = age;
		this.pw = pw;
		this.auth = auth;
	}


	

	public String getAuth() {
		return auth;
	}




	public void setAuth(String auth) {
		this.auth = auth;
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




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getPw() {
		return pw;
	}




	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
}
