package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service("studentService")
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public long getStudentRecordCount() {

		return studentRepo.count();
	}

	@Override
	public Boolean recordExistOrNot(int id) {

		return studentRepo.existsById(id);
	}

	@Override
	public Iterable<Student> fetchAllStudent() {

		return studentRepo.findAll();
	}

	@Override
	public Iterable<Student> fetchAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return studentRepo.findAllById(ids);
	}

	@Override
	public Optional<Student> fetchById(Integer sno) {

		return studentRepo.findById(sno);
	}

}
