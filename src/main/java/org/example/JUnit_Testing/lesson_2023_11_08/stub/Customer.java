package org.example.JUnit_Testing.lesson_2023_11_08.stub;

public class Customer {
	String name;
	long id;
	public Customer(){
		this(-1);
	}
	public Customer(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
}