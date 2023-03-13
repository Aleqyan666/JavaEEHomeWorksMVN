package org.javaEEhomeworks.abstract_interface.task8;

public class SubSubClass extends SAbstract {
    @Override
    public void a_method() {
        System.out.println("This is abstract method");
    }

       @Override
    public void nonAbstract_method() {
        super.nonAbstract_method();
    }
}
