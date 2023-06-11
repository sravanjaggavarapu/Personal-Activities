package com.pack1.labactivities;

import java.util.Stack;

public class Assignment28 {

	public static void main(String[] args) {

		Stack<Integer> nums = new Stack<Integer>();
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		System.out.println(nums);
		nums.pop();
		System.out.println(nums);
		System.out.println(nums.search(2));
		System.out.println(nums.peek());
		System.out.println("------------------------");
		Stack<String> names = new Stack<String>();
		names.push("sravan");
		names.push("dheeraj");
		names.push("praveen");
		names.push("sai");
		names.push("siv");
		System.out.println(names);
		names.pop();
		System.out.println(names);
		System.out.println(names.search("praveen"));
		System.out.println(names.peek());

	}

}
