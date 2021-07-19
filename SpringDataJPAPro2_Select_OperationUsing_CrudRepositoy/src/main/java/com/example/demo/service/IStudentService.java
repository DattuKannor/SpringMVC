package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Student;

public interface IStudentService {

	// count() :count number of record in table
	public long getStudentRecordCount();

	// existById : check if record is found or not for given id.
	public Boolean recordExistOrNot(int id);

	// findAll() : Fetch all record from table
	public Iterable<Student> fetchAllStudent();

	// findAllById(...) : retrive all record fotr given id
	public Iterable<Student> fetchAllById(Iterable<Integer> ids);

	// find record is presnt or not for given id
	Optional<Student> fetchById(Integer sno);

}
