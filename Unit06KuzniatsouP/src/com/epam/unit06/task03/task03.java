package com.epam.unit06.task03;

public class task03 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "Pride and Prejudice", "J. Austen", "T. Egerton, Whitehall", 1813, 434, 236, "Peacock edition cover");
        Book b2 = new Book(2, "The Queen of Spades", "A. Pushkin", "Biblioteka dlya chteniya", 1834, 52, 25, "soft");
        Book b3 = new Book(3, "Harry Potter and the Philosopher's Stone", "J. Rowling", "Bloomsbury", 1997, 309, 75, "hard");

        Library Library = new Library();
        Library.addBookToLibrary(b1);
        Library.addBookToLibrary(b2);
        Library.addBookToLibrary(b3);

        System.out.println("Books written by A.Pushkin: " + Library.findTheAuthor("A. Pushkin"));
        System.out.println("Books published after 1812: " + Library.findPublishedAfterYear(1812));
    }
}
