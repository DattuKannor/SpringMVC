package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.cl.Log4Jdemo;

@Component
public class DemoRunner implements CommandLineRunner {

	@Autowired
	Log4Jdemo demo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("DemoRunner.run()");
		demo.m1();

	}

}
