package com.pack1.labactivities;

import java.util.ArrayList;

public class Assignment12 {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(111, "Disney", "Stephen"));
		books.add(new Book(112, "The Wings Of Fire", "A.P.J Abdul Kalam"));
		books.add(new Book(113, "Mr.bean", "Bean"));
		books.add(new Book(114, "Motu Patlu", "Singha lal"));

		for (Book book : books)
			System.out.println(book.id + "  " + book.name + "  " + book.author);

		Book b = books.get(2);
		System.out.println(b.id + "  " + b.name + "  " + b.author);

	}

}
