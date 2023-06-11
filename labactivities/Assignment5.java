package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("sravan");
		names.add("dheeraj");
		names.add("saieen");
		names.add("sai");
		names.add("sava");
		if (names.contains("sai"))
			System.out.println("Element Found");
		else
			System.out.println("Element Not Found");
	}
}
