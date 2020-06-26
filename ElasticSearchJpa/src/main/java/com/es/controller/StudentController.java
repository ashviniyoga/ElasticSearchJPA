package com.es.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.model.Student;
import com.es.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentrepo;
	
	@PostMapping("/add")
	public void addStudent(Student s) {
		System.out.println("Isnide the add student()");
		studentrepo.save(s);
		 }	
	
	@GetMapping("/findbyid/{id}")
	public  Optional<Student> findById(@PathVariable int id) {
		System.out.println("Isnide the add student()");
		return studentrepo.findById(id);
	}
	
	@GetMapping("/findbyname/{name}")
	public  List<Student> findByName(@PathVariable String name) {
		System.out.println("Isnide the add student()");
		return studentrepo.findByName(name);
	}
	
	@GetMapping("/findbysubject/{subject}")
	public  List<Student> findBySubject(@PathVariable String subject) {
		System.out.println("Isnide the add student()");
		return studentrepo.findBySubject(subject);
	}
	
}
