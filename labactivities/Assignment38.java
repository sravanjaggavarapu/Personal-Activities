package com.pack1.labactivities;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Assignment38 {

	public static void main(String[] args) {
		PriorityQueue<Integer> nums = new PriorityQueue<Integer>();
		nums.add(1);
		nums.offer(2);
		nums.offer(3);
		nums.offer(4);
		nums.offer(5);
		nums.offer(6);
		Iterator<Integer> a1 = nums.iterator();
		while (a1.hasNext()) {
			System.out.print(a1.next() + " ");
		}
	}

}
