package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepo;

@Service("studentService")
public class StudentService implements IStudentService {

	@Autowired
	StudentRepo repo;

	@Override
	public String registerStudent(Student student) {

		Student s = null;

		if (student != null) {

			s = repo.save(student);
			return s != null ? "Student register with id " + s.getSno() : "Student Registration failed";
		}

		return null;
	}

	@Override
	public Iterable<Student> registerBulk(Iterable<Student> students) {

		if (students != null)
			return repo.saveAll(students);
		return null;
	}

}
