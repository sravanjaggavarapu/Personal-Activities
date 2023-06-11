package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignment16 {

	public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<String>();
		/*
		 * for(int i=0;i<10;i++) names.add("  ratan  "); for(String name : names)
		 * System.out.println(name);
		 */
    List list= Collections.nCopies(10, "ratan");
    Iterator<String> name = list.iterator();
    while(name.hasNext()) {
    	System.out.println(name.next());
    }

	}

}
