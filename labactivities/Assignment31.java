package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment31 {

	public static void main(String[] args) {
   ArrayList<Integer> nums = new ArrayList<Integer>();
   nums.add(3);
   nums.add(5);
   nums.add(8);
   nums.add(9);
   nums.add(6);
   nums.add(7);
   System.out.println(nums);
   //i.
   nums.add(11);
   System.out.println(" Eleven Added");
   System.out.println(nums);
   for(int i=0;i<=nums.size()-1;i++) {
	   int even =nums.get(i)%2;
   if(even==0) 
	   nums.remove(i);
   }
   System.out.println("Even numbers removed");
   System.out.println(nums);
   nums.set(nums.indexOf(7), 700);
   System.out.println("Replace seven with seven Hundred");
   System.out.println(nums);
   
	}

}
