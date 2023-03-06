package com.java;

public class Spain {
	
	public Spain() {
		System.out.println("Non Parameterized Constructor");
	}
	
	public Spain(String s ) {
		
		System.out.println("It is "+s);
	}
	
	public static void main(String[] args) {
		
		Spain s = new Spain();
		Spain a = new Spain("Parameterized");
		
	}

}
