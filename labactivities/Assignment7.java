package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment7 {

	public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(0);
    nums.add(1);
    nums.add(153);
    nums.add(371);
    nums.add(370);
    if(nums.isEmpty())
    	System.out.println("Already Empty");
    else {
    	System.out.println("list is not empty so clearing the list ");
    	nums.clear();
    	System.out.println("Elements are cleared");
    }
	}

}
