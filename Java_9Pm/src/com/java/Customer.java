package com.java;

public class Customer extends Bank{

	@Override
	public void axis() {
		
		System.out.println("Adyar");
	}
	
	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.axis();
		c.hdfc();
	}

}
