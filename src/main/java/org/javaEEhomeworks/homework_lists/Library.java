package org.javaEEhomeworks.homework_lists;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> bookList = new ArrayList<>();

    public Library(String name, List<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    /**
     * adding book in the library
     * @param title
     * @param author
     * @param publisher
     * @param yearPublished
     * @param ISBN
     */
    public void addBook(String title, String author, String publisher, int  yearPublished, String ISBN){
        bookList.add(new Book(title,author,publisher,yearPublished,ISBN));
    }


    public void addBook(Book book) {
        bookList.add(book);
    }

    /**
     * searching book by its author and title
     * @param title
     * @param author
     * @return
     */
    public boolean searchingBook(String title, String author){
        for (Book myBook : bookList){
            if ((myBook.getTitle().equals(title)) && (myBook.getAuthor().equals(author))){
                myBook.displayBookInfo();
                System.out.println("Book found!");
                return true;
            }
        }
        return false;
    }

    /**
     * deleting book by ITS ISBN number
     * @param ISBN
     */
    public void deleteBook(String ISBN){
        for (Book myBook : bookList){
            if (myBook.getISBN().equals(ISBN)){
                bookList.remove(myBook);
                System.out.println("Book deleted");
            }
        }
    }
}
