package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.entty.Student;
import com.example.demo.repo.StudentRepo;

@Service("studentService")
public class StudentService implements IStudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<Student> searchStudentByGivenData(Student student, boolean ascOrder, String... properties) {

		//Prepare example object
		
		Example<Student> example=Example.of(student);
		
		
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC, properties);

		List<Student> findAll = studentRepo.findAll(example, sort);
		return findAll;
	}

}
