package com.pack1.labactivities;

import java.util.HashSet;
import java.util.Iterator;

public class Assignment35 {

	public static void main(String[] args) {
		HashSet<Integer> pincodes = new HashSet<Integer>();
		pincodes.add(234567);
		pincodes.add(789065);
		pincodes.add(564321);
		pincodes.add(546789);
		pincodes.add(564321);
		Iterator<Integer> a1 = pincodes.iterator();
		while(a1.hasNext()) {
			System.out.println(a1.next());
		}
	}

}
