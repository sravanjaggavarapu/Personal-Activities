package com.pack1.labactivities;

import java.util.Vector;

public class Assignment26 {

	public static void main(String[] args) {
   Vector<String> names = new Vector<String>();
   names.add("sravan");
   names.add("praveen");
   names.add("dheeraj");
   names.add("sai");
   names.add("lohit");
   for(int i=0;i<=names.size()-1;i++)
	   System.out.println("Element at index position "+i+" is "+names.get(i));
	}

}
