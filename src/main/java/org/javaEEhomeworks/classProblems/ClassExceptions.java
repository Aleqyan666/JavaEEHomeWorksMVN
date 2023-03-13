package org.javaEEhomeworks.classProblems;

import java.util.Scanner;

public class ClassExceptions {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        char group;
        int age;
        String firstName, lastName;

        System.out.println("input first name");
         firstName = scanner2.nextLine();
        System.out.println("input last name");
         lastName = scanner2.nextLine();
        System.out.println("enter your group");
        group = scanner2.nextLine().charAt(0);
        System.out.println("enter your age");
        age = scanner.nextInt();
        try{
            System.out.println(age/0);
        }catch (ArithmeticException e){
            System.out.println("age can't be divided by 0");
        }
    }
}
