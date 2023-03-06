package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection {

	public static void main(String[] args) {

		Map<Integer, Object> m = new TreeMap<>();

		m.put(1, "Sandhiya San");
		m.put(3, true);
		m.put(5, 'l');
		m.put(71, 78);
		m.put(42, 120.5f);
		m.put(9, null);
		m.put(10, null);
		
		m.put(71, 40);
		
		m.put(51, 40);

		System.out.println(m);
		
		
		
	}                                                 

}
