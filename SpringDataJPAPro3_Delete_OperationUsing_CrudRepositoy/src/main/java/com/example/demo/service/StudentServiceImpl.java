package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public String studentRemoveById(Integer id) {

		Optional<Student> findById = studentRepo.findById(id);

		if (findById.isPresent()) {
			return "Deleting record having id =" + id;
		}
		return "record not found for deletetion";
	}

}
