package com.example.JunitProject02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertProgram {
	@Test
	public void testEquals() {
		assertEquals(10, 10);
	}

	@Test
	public void testNotEquals() {
		assertNotEquals(10, 2);
	}

	@Test
	public void testNull() {
		assertNull("Nisha", null);
	}

	@Test
	public void testNotNull() {
		assertNotNull("Arun", "Arun");
	}

	@Test
	public void testSame() {
		assertSame("Nisha", "Nisha");
	}

	@Test
	public void testNotSame() {
		assertNotSame("Nisha", "data");
	}

	@Test
	public void testTrue() {
		boolean a = 10 > 9;
		assertTrue(a);
	}

	@Test
	public void testFalse() {
		boolean a = 10==9;
		assertFalse(a);
	}

	@Test
	public void testArray() {
		int[] a = { 10, 3, 5 };
		int[] b = { 10, 3, 5 };
		assertArrayEquals(a, b);
	}

}
