package com.es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.es.model.Student;
import com.es.repository.StudentRepository;

@RestController
@RequestMapping("/s")
public class StudentController {

	@Autowired
	private StudentRepository sRepo;
	
	@PostMapping("/add")
	public void addStudent(Student s) {
		System.out.println("Isnide the add student()");
		sRepo.save(s);
		 }	
	
//	@GetMapping("/findbyid/{id}")
//	public  Optional<Student> findById(@PathVariable int id) {
//		System.out.println("Isnide the add student()");
//		return studentrepo.findById(id);
//	}
//	
//	@GetMapping("/findbyname/{name}")
//	public  List<Student> findByName(@PathVariable String name) {
//		System.out.println("Isnide the add student()");
//		return studentrepo.findByName(name);
//	}
//	
//	@GetMapping("/findbysubject/{subject}")
//	public  List<Student> findBySubject(@PathVariable String subject) {
//		System.out.println("Isnide the add student()");
//		return studentrepo.findBySubject(subject);
//	}
//	
}
