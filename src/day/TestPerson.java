package day;

import java.util.Scanner;

public class TestPerson {

	public int age;
	public String name;

	public TestPerson(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public TestPerson() {
		super();
		this.age = 18;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	
//	private String name;
	
//	public void setName(name) {
//		this.name=name;
//	}
//		
}
