package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;

@SpringBootApplication
public class SpringDataJpaPro1BasicStanloneAppApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringDataJpaPro1BasicStanloneAppApplication.class, args);

		IStudentService service = run.getBean("studentService", IStudentService.class);

//	    #Single Operation 
//	    Student s=new Student(2, "Malhar", "BCA");
//	    System.out.println(service.registerStudent(s));

		// #Bulk Operation

		Iterable<Student> t = service.registerBulk(List.of(new Student(11, "Sai", "MA"),
				new Student(6, "Gaurav", "B.ed"), new Student(9, "Sachin", "BE")));

		t.forEach(t1 -> System.out.println(t1));

	}

}
