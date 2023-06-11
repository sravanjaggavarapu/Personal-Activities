package com.pack1.labactivities;

import java.util.LinkedList;

public class Assignment25 {

	public static void main(String[] args) {
    LinkedList<Product> products = new LinkedList<Product>();
    products.add(new Product(101, "laptop",60000.89 ));
    products.add(new Product(111, "mobile",20000.56 ));
    products.add(new Product(121, "ac",30000.79 ));
    products.add(new Product(131, "refrigerator",10000.34 ));
    for(Product p : products)
    	System.out.println(p.pid+" "+p.pname+" "+p.pcost);
	}

}
