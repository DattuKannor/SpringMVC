package com.example.demo.cl;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class Log4Jdemo {
	
	Logger logger=LoggerFactory.getLogger(Log4Jdemo.class);
	public void m1()
	{
		
		logger.debug("Inside m1 meethod "+Log4Jdemo.class.getName());
		
		System.out.println("Log4Jdemo.m1()");
		
		
	}

}
