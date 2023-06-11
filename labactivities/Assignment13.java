package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment13 {

	public static void main(String[] args) {

		ArrayList<Customer> a1 = new ArrayList<Customer>();
		a1.add(new Customer(1, "sravan", 9456387999l));
		a1.add(new Customer(2, "dheeraj", 94946534568l));
		ArrayList<Customer> a2 = new ArrayList<Customer>();
		a2.add(new Customer(3, "praveen", 7896543212l));
		a2.add(new Customer(4, "pramod", 9876543210l));
		ArrayList<Customer> a3 = new ArrayList<Customer>();
		a3.add(new Customer(5, "sai", 8976543210l));
		a3.addAll(a1);
		a3.addAll(a2);
		for (Customer s1 : a3)
			System.out.println(s1.id + " " + s1.name + " " + s1.mobileno);

	}

}
