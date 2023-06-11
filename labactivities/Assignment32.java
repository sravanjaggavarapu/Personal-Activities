package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment32 {

	public static void main(String[] args) {
		  ArrayList<String> villagenames = new ArrayList<String>();
		    villagenames.add("anakapalli");
		    villagenames.add("bedurlanka");
		    villagenames.add("rangasthalam");
		    villagenames.add("viswapuram");
		    villagenames.add("anapuram");
		    ListIterator<String> a1 = villagenames.listIterator(villagenames.size());
		    while(a1.hasPrevious()) {
		    	System.out.println(a1.previous()+" ");
		    	
		    }
	}

}
