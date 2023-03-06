package com.india;


public class Variables {
	
	
	static int b;  // Class Variable
	
	public static void setUp() {

		 int a = 10; //local Variable
		System.out.println(a);
		System.out.println(b);
	}
	
	static {
		
		System.out.println("Sandhiya");
	}
	
	public static void main(String[] args) {
		
		setUp();
		System.out.println(b);
	}
	
	

}
