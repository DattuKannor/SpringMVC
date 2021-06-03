package com.example.demo.beans;


import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;



@Component("stu")
public class Student {
	
	
	@Resource(name = "courseId")
	
	@Autowired
	ICourseMaterial material;
	
	public  void  preparation(String examName) {
		System.out.println("preparation started for  "+examName);
		
		material.courseContent();
		material.price(500);
		//System.out.println("preparation is going on using"+courseConent+" material  with price ::"+price);
		System.out.println("preparation is completed for "+examName);
	}

}
