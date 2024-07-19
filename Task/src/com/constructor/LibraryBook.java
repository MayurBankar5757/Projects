package com.constructor;

public class LibraryBook {
    // Attributes
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Constructor
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Set the book as available when created
    }

    public void borrowBook() {
        if (available) {
            available = false; // Set the book as not available when borrowed
            System.out.println("Book '" + title + "' has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true; // Set the book as available when returned
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("This book is already available in the library.");
        }
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Catcher in the Rye", "J.D Salinger", "978-006-112008-0");
        LibraryBook book2 = new LibraryBook("To Kill a Mockingbird", "Harper Lee", "978-006-112008-4");

        book1.borrowBook();
        book2.borrowBook();
        book1.returnBook();

        // Display book availability
        System.out.println("Book 1 Available: " + book1.available);
        System.out.println("Book 2 Available: " + book2.available);
    }
}
