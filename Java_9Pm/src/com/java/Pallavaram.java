package com.java;

public class Pallavaram implements Vels{

	@Override
	public void bca() {

		System.out.println("2018");
	}

	@Override   
	public void bcom() {

		System.out.println("2020");
	}
	
	public static void main(String[] args) {
		
		Pallavaram p = new Pallavaram();
		p.bca();
		p.bcom();
	}

}
