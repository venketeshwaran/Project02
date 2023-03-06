package com.java;

public class Exception_Handling {

	public static void main(String[] args) {

		int i = 10;
		try {
			System.out.println(i / 0);

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Arun");
		}
		
		finally {
			System.out.println("venkat");
		}
	}
}
