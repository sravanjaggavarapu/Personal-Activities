package com.pack1.labactivities;

import java.util.LinkedList;

public class Assignment22 {

	public static void main(String[] args) {
		
		  LinkedList<String> animals = new LinkedList<String>(); 
		  animals.add("zebra");
		  animals.add("lion");
		  animals.add("tiger");
		  animals.add("cheetah");
		  animals.add("elephant");
		  animals.removeFirst();
		  animals.removeLast();
		  System.out.println(animals);
		  System.out.println("First Element : "+animals.getFirst());
		  System.out.println("Last Element  : "+animals.getLast());
		 
		
		
		/*
		 * TreeSet<String> nums = new TreeSet<String>(); nums.add("sravan");
		 * nums.add("dherraj"); nums.add("praveen"); nums.add("sai"); nums.add("mohit");
		 * System.out.println(nums.headSet("sai"));
		 */		 		

	}

}
