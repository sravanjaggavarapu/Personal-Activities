package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment14 {
	
	public void meth1(ArrayList<String> a3) {
		for(String s : a3)
			System.out.println(s);
	}

	public static void main(String[] args) {
    ArrayList<String> a1 = new ArrayList<String>();
    a1.add("sravan");
    a1.add("ravan");
    a1.add("a van");
    a1.add("van");
    Assignment14 obj = new Assignment14();
    obj.meth1(a1);
    
	}

}
