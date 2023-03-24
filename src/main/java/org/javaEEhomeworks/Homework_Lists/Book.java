package org.javaEEhomeworks.Homework_Lists;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private  String  ISBN;

    public Book(String title, String author, String publisher, int yearPublished, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    /**
     *displaying info about books
     */
    public void displayBookInfo(){
        System.out.println("=".repeat(50));
        System.out.println("Title : " + getTitle() + '\n' +
                "Author : " + getAuthor() + '\n' +
                "Publisher : " + getPublisher() + '\n' +
                "Year published : " + getYearPublished() + '\n'+
                "ISBN : " + getISBN()
        );
        System.out.println("=".repeat(50));
    }
}
