package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;

@SpringBootApplication
public class SpringDataJpaPro2SelectOperationUsingCrudRepositoyApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication
				.run(SpringDataJpaPro2SelectOperationUsingCrudRepositoyApplication.class, args);

		IStudentService service = run.getBean("studentService", IStudentService.class);

		try {
			// long studentRecordCount = service.getStudentRecordCount();
			// System.out.println("Total number of record of record in table : " +
			// studentRecordCount);

			// System.out.println("Record is found = " + service.recordExistOrNot(4));

			// -----FETCH ALL------
			// Iterable<Student> fetchAllStudent = service.fetchAllStudent();
			// using forEach with lada expression
			// fetchAllStudent.forEach(student -> System.out.println(student));
			// improved forEach with labda expression
			// service.fetchAllStudent().forEach(student -> System.out.println(student));

			// fetchAllByIds
			// Iterable<Student> fetchAllById = service.fetchAllById(List.of(1, 2, 3, 8,
			// 9));
			// fetchAllById.forEach(student -> System.out.println(student));

			// findById
			Optional<Student> fetchById = service.fetchById(4);

			if (fetchById.isPresent()) {
				System.out.println(fetchById.get());
			} else {
				System.out.println("Record not found ..!!!");
			}
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
