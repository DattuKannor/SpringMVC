package com.example.demo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.cl.DemoLog4j;

@Component
public class DemoRunner implements CommandLineRunner {

	@Autowired
	DemoLog4j d;

	Logger logger=LoggerFactory.getLogger(DemoRunner.class);
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hi");
		System.out.println("DemoRunner.run()");
		logger.debug("DemoRunner.run()");
		d.m1();

	}

}
