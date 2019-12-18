package com.aroha.demo.model;

public class StudentNotFoundException extends RuntimeException {
//    String msg;
	public StudentNotFoundException(String msg) {
		super(msg);
//		this.msg = msg;
	}
	
	/*
	 * public Object displayMsg() { System.out.println(msg); return msg; }
	 */
}
