package com.example.demo.cl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoLog4j {

	Logger logger = LoggerFactory.getLogger(DemoLog4j.class);

	public void m1() {
		System.out.println("DemoLog4j.m1()");
		logger.debug("DemoLog4j.m1()");
	}

}
