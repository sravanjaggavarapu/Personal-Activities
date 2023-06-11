package com.pack1.labactivities;

import java.util.PriorityQueue;

public class Assignment39 {

	public static void main(String[] args) {
		PriorityQueue<Integer> nums1 = new PriorityQueue<Integer>();
		nums1.add(1);
		nums1.offer(2);
		nums1.offer(3);
		nums1.offer(4);
		nums1.offer(5);
		nums1.offer(6);
		System.out.println(nums1);
		PriorityQueue<Integer> nums2 = new PriorityQueue<Integer>();
		nums2.add(11);
		nums2.add(22);
		nums2.add(4);
		nums2.add(2);
		nums2.add(13);
		nums2.add(1);
		//nums1.add(15);
		System.out.println(nums1);
		System.out.println("comparing two pqs");
		for (Integer num : nums1)
			System.out.println(nums2.contains(num) ? "yes" : "no");

	}

}
