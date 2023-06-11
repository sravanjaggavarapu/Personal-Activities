package com.pack1.labactivities;

import java.util.LinkedList;


public class Assignment21 {

	public static void main(String[] args) {
    LinkedList<String> colors = new LinkedList<String>();
    colors.add("red");
    colors.add("blue");
    colors.add("yellow");
    colors.add("black");
    colors.add("blue");
    colors.addFirst("aqua");
    colors.addLast("violet");
    System.out.println(colors);
    colors.set(3, "radium");
    System.out.println(colors);
    System.out.println(colors.subList(0, 1));
	}

}
