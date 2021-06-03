package com.example.demo.beans;

import org.springframework.stereotype.Component;


@Component("ui")
public class CourseUI  implements ICourseMaterial{

	@Override
	public void courseContent() {
		System.out.println("UI course content :1.HTML 2.CSS 3.Javascript");
		
	}

	@Override
	public void price(int price) {
		System.out.println("UI course content price: "+price);
		
	}

}
