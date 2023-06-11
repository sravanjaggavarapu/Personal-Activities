package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment17 {

	public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("yellow");
    colors.add("blue");
    colors.add("green");
    Collections.swap(colors, 0, 3);
    	System.out.println(colors);
    System.out.println("---------------------");
    System.out.println("before shuffle : "+colors);
    Collections.shuffle(colors);
    System.out.println("After Shuffle : "+colors);
    
	}

}
