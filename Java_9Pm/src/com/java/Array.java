package com.java;

public class Array {
	
	public static void main(String[] args) {

		int a[] = new int[5];
		// Storing multiple values in single variables
		// length is fixed
		// Support similar datatype
		// index base
		// if you add duplicate value it take override
		a[0]=74;
		a[1]=85;
		a[2]=52;
		a[2]=85;
		a[3]=14;
		a[4]=85;
		
		System.out.println(a);
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);//a[0] //a[1] //a[2]
		}
		
	}

}
