package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment6 {

	public static void main(String[] args) {
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		System.out.println(vowels);
		System.out.println("----------------------");
		vowels.set(1, 'b');
		System.out.println(vowels);
		System.out.println("----------------------");
		vowels.set(2, 'c');
		System.out.println(vowels);
		System.out.println("----------------------");
		vowels.remove(0);
		System.out.println(vowels);
		System.out.println("-----------------------");
        vowels.remove(Character.valueOf('b'));
        System.out.println(vowels);
        
	}

}
