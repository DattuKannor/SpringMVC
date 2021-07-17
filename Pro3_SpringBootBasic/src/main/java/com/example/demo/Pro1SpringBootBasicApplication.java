package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.beans.Student;

@SpringBootApplication
@ImportResource("com/example/demo/cfg/applicationContext.xml")
public class Pro1SpringBootBasicApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Pro1SpringBootBasicApplication.class, args);
		
		System.out.println("Testing");
		Student s=run.getBean("stu",Student.class);
		s.preparation("prelim exam");
	}

}
