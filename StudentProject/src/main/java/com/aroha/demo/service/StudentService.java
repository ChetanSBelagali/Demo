package com.aroha.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aroha.demo.model.Student;
import com.aroha.demo.model.StudentNotFoundException;
import com.aroha.demo.repository.StudentData;
import com.aroha.demo.repository.StudentRepo;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepo studentrepo;
	
	public String saveAll(Student student)
	{
		studentrepo.save(student);
		return "Record successfully saved";
	}
	
	public Student getspecificrecord(int rollno)
	{
		//return studentrepo.findById(rollno).orElse(new Student());
		return studentrepo.findById(rollno).orElseThrow(()->new StudentNotFoundException("no such "+rollno+" exists"));
	}
	
	public List<Student> getAllRecord()
	{
		return studentrepo.findAll();
		
	}
	
	public List<StudentData> getName()
	{
		return studentrepo.getname();
		
	}
}
