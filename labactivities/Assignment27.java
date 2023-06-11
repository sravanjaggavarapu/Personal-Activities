package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Assignment27 {

	public static void main(String[] args) {
		ArrayList<Integer> evennums = new ArrayList<Integer>();
		evennums.add(2);
		evennums.add(4);
		evennums.add(6);
		evennums.add(8);
		LinkedList<Integer> oddnums = new LinkedList<Integer>();
		oddnums.add(1);
		oddnums.add(3);
		oddnums.add(5);
		oddnums.add(7);
		Vector<Integer> nums = new Vector<Integer>();
		nums.addAll(evennums);
		nums.addAll(oddnums);
		for(Integer num : nums) {
			System.out.println(num);
		}

	}

}
