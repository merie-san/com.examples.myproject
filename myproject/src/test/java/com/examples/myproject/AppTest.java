package com.examples.myproject;

import static org.junit.Assert.*;
import org.junit.*;

public class AppTest {

	private App app;

	@Before
	public void setup() {
		this.app = new App();
	}

	@Test
	public void testSayHello() {
		assertEquals("Hello!", app.sayHello());
	}

	@Test
	public void testSayHelloWithName() {
		assertEquals("Hello David!", app.sayHello("David"));
	}
}
