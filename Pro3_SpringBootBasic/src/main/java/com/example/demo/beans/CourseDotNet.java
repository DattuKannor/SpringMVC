package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component("dotNet")
public class CourseDotNet implements ICourseMaterial {


	@Override
	public void courseContent() {
		System.out.println("DotNet course content :1.Opps Dot net 2.Array ");
		
	}

	@Override
	public void price(int price) {
		System.out.println("Dot Net course content price: "+price);
		
	}

}
