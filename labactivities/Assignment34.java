package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.HashSet;

public class Assignment34 {

	public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<String>();
     names.add("sravan");
     names.add("sravan");
     names.add("praveen");
     names.add("pramod");
     names.add("pramod");
     names.add("praveen");
     names.add("sai");
     names.add("sai");
     HashSet<String> name = new HashSet<String>(names);
     System.out.println(name);
	}

}
