package com.aroha.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String name;
	private String email;
	private long mobileno;
	private String guardianname;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getGuardianname() {
		return guardianname;
	}
	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}
}
