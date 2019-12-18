package com.aroha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aroha.demo.model.Student; 
import com.aroha.demo.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	private StudentService studentservice;
	
	@GetMapping("/savestudent")
	public ResponseEntity<?> savedata(@RequestBody Student student)
	{
		System.out.println("Student name is: "+student.getName());
		return ResponseEntity.ok(studentservice.saveAll(student));
	}

	@GetMapping("/getspecificrecord")
	public ResponseEntity<?> getspecificrecord(@RequestBody Student student)
	{
		int rollno = student.getRollno();
		System.out.println("Roll no is :"+rollno);
		return ResponseEntity.ok(studentservice.getspecificrecord(rollno));
	}
	
	@GetMapping("/getallrecord")
	public ResponseEntity<?> getallrecord()
	{
		return ResponseEntity.ok(studentservice.getAllRecord());
	}
	
	@GetMapping("/getstudentname")
	public ResponseEntity<?> getstudentName()
	{
		System.out.println("I am here");
		return ResponseEntity.ok(studentservice.getName());
	}
	
}
