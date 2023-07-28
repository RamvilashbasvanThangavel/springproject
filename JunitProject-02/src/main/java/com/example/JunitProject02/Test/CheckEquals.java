package com.example.JunitProject02.Test;

public class CheckEquals {
	public String reverseThis(String a) {
		String name = "moon";
		String temp = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			temp = temp + name.charAt(i);
		}
		return temp;
	}

}
