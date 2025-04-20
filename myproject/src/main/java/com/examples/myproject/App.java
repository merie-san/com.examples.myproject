package com.examples.myproject;

public class App {

	public String sayHello(String name) {
		if (name != null) {
			return "Hello " + name + "!";
		} else {
			return "Hello!";
		}
	}

	public String sayHello() {
		return sayHello(null);
	}
}
