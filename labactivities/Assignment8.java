package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment8 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		int sum = 0;
		for (int i = 0; i <= nums.size() - 1; i++) {
			sum = sum + nums.get(i);
		}
		int avg = sum / nums.size();

		System.out.println("sum : " + sum);
		System.out.println("average : " + avg);

	}

}
