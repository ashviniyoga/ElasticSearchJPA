package com.es.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String studentName;
	private int marks;
	private String Subjects;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubjects() {
		return Subjects;
	}
	public void setSubjects(String subjects) {
		Subjects = subjects;
	}
	public Student(int id, String studentName, int marks, String subjects) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.marks = marks;
		Subjects = subjects;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", marks=" + marks + ", Subjects=" + Subjects
				+ "]";
	}
	
	

}
