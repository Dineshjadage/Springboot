package com.example.demo;

public class Employee {
	private int id;
	private String name;
	private Address address;
	public Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
		public String toString()
	{
		return id+" "+name+" "+address;
	}
	
}