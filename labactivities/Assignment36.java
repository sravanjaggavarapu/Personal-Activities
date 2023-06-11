package com.pack1.labactivities;

import java.util.LinkedHashSet;

public class Assignment36 {

	public static void main(String[] args) {
     LinkedHashSet<Integer> nums = new LinkedHashSet<Integer>();
     nums.add(23);
     nums.add(34);
     nums.add(78);
     nums.add(21);
     nums.add(90);
     nums.add(53);
     Integer arr[] = new Integer[nums.size()];
     arr = nums.toArray(arr);
     System.out.println("First Element in set :"+arr[0]);
     System.out.println("last Element in set :"+arr[arr.length-1]);
	}

}
