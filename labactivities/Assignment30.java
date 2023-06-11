package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment30 {

	public static void main(String[] args) {
		ArrayList<Double> heights = new ArrayList<Double>();
		heights.add(3.2);
		heights.add(5.5);
		heights.add(6.8);
		heights.add(6.0);
		heights.add(4.9);
		System.out.println(heights);
		Iterator<Double>itr1=heights.iterator();
		while(itr1.hasNext()) {
			double x=itr1.next();
		if(x< 5.0) {
			itr1.remove();
		}
		}
		System.out.println(heights);
	}

}
