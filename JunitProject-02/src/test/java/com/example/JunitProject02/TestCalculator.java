package com.example.JunitProject02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.example.JunitProject.junitPackage.Calculator;

public class TestCalculator {
	Calculator c = new Calculator();

	@Before
	public void first() {
		System.out.println("Start");
	}

	@Test
	public void testAdd() {
		System.out.println(c.add(8, 2));
	}

	@Test
	public void testSub() {
		c.sub(50, 20);
	}

	@Test
	public void testMul() {
		System.out.println(c.mul(3, 5));
	}

	@Test
	public void testDiv() {
		c.div(10, 2);
	}

	@After
	public void last() {
		System.out.println("End");
	}

}
