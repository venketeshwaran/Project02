package com.java;

public class College extends Chennai {

	int a = 20;

	private void testData() {

		int a = 30;
		System.out.println("Current class reference" + this.a);// 20
		System.out.println(a);
	}

	public static void main(String[] args) {

		College c = new College();
		c.testData();

	}
}
