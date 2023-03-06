package com.java;

public class Class_B extends Class_A{

	
	int i = 15;
	
	
	private void local_V() {
        int i = 10;
     System.out.println(i);
     System.out.println(this.i);
     System.out.println(super.i);
	}
	
	public static void main(String[] args) {
		Class_B c = new Class_B();
		c.local_V();
	
	}
	
}
