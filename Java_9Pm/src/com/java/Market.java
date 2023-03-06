package com.java;

public class Market extends Apple {

	@Override
	public void greenApple() {

		System.out.println("50 ruppes");
	}
	
	public static void main(String[] args) {
	
		Market m = new Market();
		m.redApple();
		m.greenApple();
	}
	
	

}
