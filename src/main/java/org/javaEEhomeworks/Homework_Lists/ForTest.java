package org.javaEEhomeworks.Homework_Lists;

import java.util.ArrayList;

public class ForTest{
    public static void main(String[] args) {
        Library johnStones24 = new Library("John Stones", new ArrayList<>());
        johnStones24.addBook(" 3000meters under water ", "Jules Verne",
                "French ...",1874,"978-9-7293-7824-9");
        Book aliceMagical = new Book("Alice in the world of Magic", "Bruce Lee",
                "Zangak",2050,"987-217-11-11-3");
        johnStones24.addBook(aliceMagical);
        aliceMagical.displayBookInfo();
    }
}
