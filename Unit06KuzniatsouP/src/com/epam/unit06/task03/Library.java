package com.epam.unit06.task03;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> Library;

    public Library() {
        Library = new ArrayList<>();
    }

    public ArrayList<Book> getLibrary() {
        return Library;
    }

    public void addBookToLibrary(Book b) {
        Library.add(b);
    }

    public ArrayList<Book> findTheAuthor(String author) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b : Library) {
            if (b.getAuthor().equals(author))
                booksFound.add(b);
        }
        if (booksFound.isEmpty()) {
            System.out.println("No books in the library written by " + author);
        }
        return booksFound;
    }

    public ArrayList<Book> findPublishedAfterYear(int yearOfPublish) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for (Book b : Library) {
            if (b.getYearOfPublish() > yearOfPublish)
                booksFound.add(b);
        }
        if (booksFound.isEmpty()) {
            System.out.println("No books on the shelf published after " + yearOfPublish);
        }
        return booksFound;

    }

    public void setLibrary(ArrayList<Book> _Library) {
        this.Library = _Library;
    }
}
