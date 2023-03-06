package com.java;

public class Demo {

	public static void main(String[] args) {
	
		int i[] =  new int [5];
		
		i[0] = 40;
		i[1] = 10;
		i[3] = 78;                            
		i[4] = 69;
		i[2] = 10;
		i[4] = 8;
		
		
		for (int j = 0; j < i.length; j++) { //j=0; 0<5; j=0 // j=1; 1<5 j=1
			System.out.println(i[j]);//i[0] j++; //i[1]
		}
	
	}

}
