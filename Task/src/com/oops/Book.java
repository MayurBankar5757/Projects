package com.oops;

public class Book extends LibraryItem {
	private String author;
	
	
	
	public Book(String title, int itemId, String author) {
		super(title, itemId);
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public
	void displayInfo() {
		System.out.println("Book Title " + getTitle());
		System.out.println("Book ID :" + getItemId());
		System.out.println("Author :" + getAuthor());

		
	}
}
