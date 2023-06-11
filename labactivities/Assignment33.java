package com.pack1.labactivities;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment33 {

	public static void main(String[] args) {
     ArrayList<Emp> emps = new ArrayList<Emp>();
     emps.add(new Emp(121, "sravan", 300000.43));
     emps.add(new Emp(122, "praveen", 2450000.43));
     emps.add(new Emp(123, "pramod", 380000.43));
     emps.add(new Emp(124, "dheeraj", 8900000.43));
     Iterator<Emp> a1 = emps.iterator();
     while(a1.hasNext()) {
    	 Emp e = a1.next();
    	 System.out.println(e.id+" "+e.name+" "+e.salary);
     }
	}

}
