package com.aroha.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aroha.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> 
{
	@Query("select new com.aroha.demo.repository.StudentData(n.name) from Student as n")
	public List<StudentData> getname();
}
