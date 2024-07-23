package com.oops.encapsulations;

//Task 1: Define Classes and Implement Encapsulation
public class Books {

	// Private fields for encapsulation
	private String title;
	private String author;
	private String isbn;
	private int numberOfPages;

	// Constructor to initialize the fields
	public Books(String title, String author, String isbn, int numberOfPages) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setIsbn(isbn);
		this.setNumberOfPages(numberOfPages);
	}

	// getter and setter method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\''
				+ ", numberOfPages=" + numberOfPages + '}';

	}

//Task 2: Implement Inheritance java

	public class Ebook extends Books {
		private double fileSize;
		private String format;

		public Ebook(String title, String author, String isbn, int numberOfPages, double fileSize, String format) {
			super(title, author, isbn, numberOfPages);
			this.fileSize = fileSize;
			this.format = format;
		}

		public double getFileSize() {
			return fileSize;
		}

		public void setFileSize(double fileSize) {
			this.fileSize = fileSize;
		}

		public String getFormat() {
			return format;
		}

		public void setFormat(String format) {
			this.format = format;
		}

		// Override the toString method to include the new fields
		@Override
		public String toString() {
			return super.toString() + ", EBook{" + "fileSize=" + fileSize + ", format='" + format + '\'' + '}';
		}

	}

}
