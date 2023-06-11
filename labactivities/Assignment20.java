package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment20 {

	public static void main(String[] args) {
    ArrayList<String> instnames = new ArrayList<String>();
    instnames.add("sathya");
    instnames.add("mvr");
    instnames.add("ssr");
    instnames.add("svr");
    instnames.add("tdr");
    ListIterator<String> a1 =  instnames.listIterator(instnames.size());
    System.out.println("----Printing in Reverse Order----");
    while(a1.hasPrevious()) {
    	System.out.println(a1.previous()+" ");
    }
	}

}
