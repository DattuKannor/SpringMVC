package com.example.demo.service;

import com.example.demo.entity.Student;


public interface IStudentService {

	public String registerStudent(Student student);
	public Iterable<Student> registerBulk(Iterable<Student> students);
}
