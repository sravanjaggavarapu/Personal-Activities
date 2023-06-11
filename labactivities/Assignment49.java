package com.pack1.labactivities;

import java.util.Scanner;
import java.util.TreeMap;

public class Assignment49 {

	public static void main(String[] args) {
		TreeMap<Character, Integer> roman = new TreeMap<Character, Integer>();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman value");
		String s = sc.next();
		int res = 0;
		int prev = 0;
		int currvalue=0;
		for (int i = s.length() - 1; i >= 0; i--) {
			currvalue = roman.get(s.charAt(i));
			if (currvalue < prev)
				res = res - currvalue;
			else
				res = currvalue + res;
			prev = currvalue;
		}
		
		System.out.println(res);
		sc.close();
	}

}
