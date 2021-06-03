package com.example.demo.beans;

import org.springframework.stereotype.Component;



@Component("java")
public class CourseJava implements ICourseMaterial{

	@Override
	public void courseContent() {
		
		System.out.println("Java course content :1.Opps 2.Collection 3.String");
		
	}

	@Override
	public void price(int price) {
		System.out.println("Java course content price: "+price);
		
	}

}
