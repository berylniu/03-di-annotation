package com.bigwhite.di01;

public class Student {
	
	public Student() {
		super();
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}
