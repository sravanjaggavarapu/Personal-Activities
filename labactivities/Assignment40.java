package com.pack1.labactivities;

import java.util.HashMap;

import java.util.Iterator;

public class Assignment40 {

	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<Integer, String>();
		names.put(100, "informational response");
		names.put(200, "successful response");
		names.put(300, "redirectional response");
		names.put(400, "client error response");
		names.put(500, "server error response");
		System.out.println(names);
		System.out.println(names.get(1));
		Iterator<Integer> key = names.keySet().iterator();
		while (key.hasNext())
			System.out.println(key.next());
		System.out.println();
		Iterator<String> value = names.values().iterator();
		while (value.hasNext())
			System.out.println(value.next());
	}

}
