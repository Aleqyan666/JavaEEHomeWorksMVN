package org.javaEEhomeworks.generics_homework;

import java.util.ArrayList;

public class Library<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public Library() {
        Book b = new Book();
        storeMedia((T) b);
        Video v = new Video();
        storeMedia((T) v);
        Newspaper n = new Newspaper();
        storeMedia((T) n);
    }

    public void storeMedia(T item) {
        list.add(item);
    }

    public class Book implements Media {

        String type = "book";
        String name = "Adventures of Garnik";

        public Book(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public Book(){

        }

    }

    class Video implements Media {

        String type = "video";
        String name = "death of jana d' ark";

    }

    class Newspaper {

        String type = "newspaper";
        String name = "New York Times ";


    }

    interface Media {

    }
}