package com.example.demo.service;

import java.util.List;

import com.example.demo.entty.Student;

public interface IStudentService {

	public List<Student> searchStudentByGivenData(Student student, boolean ascOrder, String... properties);

}
