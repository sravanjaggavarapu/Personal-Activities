package com.pack1.labactivities;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment29 {

	public static void main(String[] args) {
		Enumeration<String> name;
		Vector<String> names=new Vector<String>();
		names.add("kims");
		names.add("sunrise");
		names.add("osmania");
		names.add("help");
		names.add("rainbow");
		name = names.elements();
		while(name.hasMoreElements()) {
			System.out.println(name.nextElement());
		}

	}

}
