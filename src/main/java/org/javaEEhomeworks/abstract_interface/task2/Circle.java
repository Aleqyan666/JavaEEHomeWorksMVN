package org.javaEEhomeworks.abstract_interface.task2;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("The circle is drawn");
    }

    @Override
    public void erase() {
        System.out.println("The circle is erased");
    }
}
