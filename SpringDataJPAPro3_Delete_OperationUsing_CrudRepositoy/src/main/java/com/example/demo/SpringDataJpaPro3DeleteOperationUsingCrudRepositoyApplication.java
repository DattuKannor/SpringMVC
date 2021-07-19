package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.service.IStudentService;

@SpringBootApplication
public class SpringDataJpaPro3DeleteOperationUsingCrudRepositoyApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication
				.run(SpringDataJpaPro3DeleteOperationUsingCrudRepositoyApplication.class, args);

		IStudentService service = run.getBean("studentService", IStudentService.class);

		System.out.println(service.studentRemoveById(9));
	}

}
