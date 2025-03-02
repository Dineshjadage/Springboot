package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CdApplication 
{
	public static void main(String[] args) 
 	{
	//SpringApplication.run(CdApplication.class, args);
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("e.xml");
	System.out.println(context.getBean("e1"));
	}
}