package org.javaEEhomeworks.inheritance.tasks5_7;

public class Author {
    public String name;
    public String  birthPlace;
    public double height;

    public Author(String name, String birthPlace, double height) {
        this.name = name;
        this.birthPlace = birthPlace;
        this.height = height;
    }

    class Book{
        public String title;
        public Author author;
    }
}
