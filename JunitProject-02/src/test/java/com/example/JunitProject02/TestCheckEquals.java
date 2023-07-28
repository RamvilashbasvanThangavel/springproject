package com.example.JunitProject02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.JunitProject02.Test.CheckEquals;

public class TestCheckEquals {
	CheckEquals ct = new CheckEquals();

	@Test
	public void show() {
		assertEquals(ct.reverseThis("noom"), "noom");
	}
}
