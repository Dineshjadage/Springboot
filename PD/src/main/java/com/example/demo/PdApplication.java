package com.example.demo; 

import org.springframework.boot.SpringApplication; 

import org.springframework.boot.autoconfigure.SpringBootApplication; 

import org.springframework.context.support.ClassPathXmlApplicationContext; 

 

@SpringBootApplication 

public class PdApplication  

{ 

public static void main(String[] args)  

{ 

//SpringApplication.run(Pd1Application.class, args);		
	ClassPathXmlApplicationContext context=new 
			ClassPathXmlApplicationContext("Emp.xml");		
	System.out.println(context.getBean("e1")); 

} 

} 