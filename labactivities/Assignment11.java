package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment11 {

	public static void main(String[] args) {
     ArrayList<String> laptops = new ArrayList<String>();
     laptops.add("hp");
     laptops.add("dell");
     laptops.add("lenovo");
     laptops.add("acer");
     laptops.add("asus");
     Object[] objects = laptops.toArray();
     for(Object obj : objects)
    	 System.out.println(obj);
     
     String[] str = new String[laptops.size()];
     str = laptops.toArray(str);
     System.out.println("====================");
     for(String st : str)
    	 System.out.println(st);
     
     //  to array() method used to convert list objects into array format.
	}
}
