package org.javaEEhomeworks.abstract_interface.task2;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("The square is drawn");
    }

    @Override
    public void erase() {
        System.out.println("The square is erased");
    }
}
