package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;

@SpringBootApplication
public class SpringDataJpaPro4PagingAndSortingRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication
				.run(SpringDataJpaPro4PagingAndSortingRepositoryApplication.class, args);

		IStudentService service = run.getBean("studentService", IStudentService.class);

		// Iterable<Student> fetchStudentAsc = service.fetchStudentAsc(true, "sname");
		// fetchStudentAsc.forEach(student->System.out.println(student));

		Iterable<Student> fetchDetailsByPageNumber = service.fetchDetailsByPageNumber(1, 2, true, "sname");
		fetchDetailsByPageNumber.forEach(student -> System.out.println(student));
	}

}
