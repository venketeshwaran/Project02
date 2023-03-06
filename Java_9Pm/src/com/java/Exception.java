package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception {
	
	public static void main(String[] args) {
		
		//System.out.println(10/0); // ArithemeticException
		
//		String s =null; 
//		
//		char charAt = s.charAt(1);
//		System.out.println(charAt); //nullpointerException
//		
//		Scanner s = new Scanner(System.in);
//		int nextInt = s.nextInt();
//		System.out.println(nextInt); //InputMisMatch
		
//		int i[] = new int[3]; //ArrayindexoutofBoundsException
//		i[0]=45;
//		i[1]=4;
//		i[2]=78;
//		i[3]=10;
//		System.out.println(i[2]);
//		
//		for (int j = 0; j < i.length; j++) {
//			System.out.println(i[j]);
//		}
		
//		List<Integer> li = new ArrayList<>(); //indexoutofbounds
//		
//		li.add(10);
//		li.add(40);
//		li.add(80);
//		li.add(780);
//		li.add(110);
//		li.add(1220);
//		li.add(150);
//
//		
//		System.out.println(li);
//	
//		Integer integer = li.get(7);
//		System.out.println(integer);
		
//		String s = "Ven123"; //numberformatException
//		
//		int parseInt = Integer.parseInt(s);
//		
//		System.out.println(parseInt);
		
		String s = "San"; //StringIndexoutofBound
		char charAt = s.charAt(3);
		System.out.println(charAt);
	}

}
