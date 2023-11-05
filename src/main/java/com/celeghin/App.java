package com.celeghin;

public class App {
	String name = "Hidden";
	
	public App(String name) {
		this.name = name;
	}

	String sayHello() {
		System.out.println("Hello World " + name);
		return name;
	}
}
