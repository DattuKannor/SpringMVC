package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entty.Student;
import com.example.demo.service.IStudentService;

@SpringBootApplication
public class SpringDataJpaPro5JpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringDataJpaPro5JpaRepositoryApplication.class,
				args);

		IStudentService service = run.getBean("studentService", IStudentService.class);

		Student s = new Student();
		s.setSno(2);
		s.setSname("Malhar");
		s.setScourse("BCA");

		service.searchStudentByGivenData(s, true, "sname").forEach(student -> System.out.println(student));

		

	}

}
