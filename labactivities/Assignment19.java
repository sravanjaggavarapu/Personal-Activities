package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment19 {

	public static void main(String[] args) {
      ArrayList<String> facnames = new ArrayList<String>();
      facnames.add("sravan");
      facnames.add("praveen");
      facnames.add("dheeraj");
      facnames.add("pramod");
      facnames.add("nikil");
		/*
		 * System.out.println("Ascending Order"); System.out.println(facnames);
		 */      
      ListIterator<String> a1 = facnames.listIterator();
      System.out.println("------Ascending Order-----------");
      while(a1.hasNext()) {
    	  System.out.println(a1.next()+" ");
      }
      System.out.println("---------Descending Order----------");
      while(a1.hasPrevious()) {
    	  System.out.println(a1.previous()+" ");
      }
      
      
	}

}
