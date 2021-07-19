package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRepo studentRepo;

	@Override
	public Iterable<Student> fetchStudentAsc(boolean order, String... properties) {

		Sort sort = Sort.by(order ? org.springframework.data.domain.Sort.Direction.ASC
				: org.springframework.data.domain.Sort.Direction.DESC, properties);

		Iterable<Student> findAll = studentRepo.findAll(sort);

		return findAll;

	}

	@Override
	public Iterable<Student> fetchDetailsByPageNumber(int pageno, int pageSize, boolean order, String... properties) {
		Pageable pageable = PageRequest.of(pageno, pageSize, order ? Direction.ASC : Direction.DESC, properties);
		Page<Student> findAll = studentRepo.findAll(pageable);
		return findAll;
	}

}
