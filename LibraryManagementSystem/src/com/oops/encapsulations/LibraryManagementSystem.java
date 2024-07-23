package com.oops.encapsulations;

import com.oops.encapsulations.Books.Ebook;

//Task 3: Demonstrate Polymorphism

public class LibraryManagementSystem {

	public static void main(String[] args) {
		// Create an array of Book objects that includes both Book and EBook instances
		Books[] bookss = new Books[2];
		bookss[0] = new Books("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 180);
		bookss[1] = new Ebook("1984", "George Orwell", "9780451524935", 328, 1.5, "EPUB");

		// use a loop to iterate through the array and print out the details of each
		// book

	}

}
