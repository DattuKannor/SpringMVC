package com.example.demo.service;

import com.example.demo.entity.Student;

public interface IStudentService {

	public Iterable<Student> fetchStudentAsc(boolean order, String... properties);
	public Iterable<Student> fetchDetailsByPageNumber(int pageno,int pageSize,boolean order,String ...properties);

}
