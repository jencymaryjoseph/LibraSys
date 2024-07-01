package models;

import java.util.LinkedList;

public class User {
    private int id;
    private String name;
    private String email;
    private LinkedList<Book> borrowedBooks;

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.borrowedBooks = new LinkedList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(LinkedList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    
    // Add book to borrowed list
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Remove book from borrowed list
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}
