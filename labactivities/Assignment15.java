package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment15 {
	public ArrayList<String> meth1() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("sravan");
		a1.add("dheeraj");
		a1.add("praveen");
		a1.add("pramod");
		return a1;
	}

	public static void main(String[] args) {
		Assignment15 obj = new Assignment15();
		System.out.println(obj.meth1());
	}

}
