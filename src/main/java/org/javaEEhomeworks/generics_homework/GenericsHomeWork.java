package org.javaEEhomeworks.generics_homework;

import java.util.Collections;
import java.util.List;

public class GenericsHomeWork {
    /** task1
     * Write a generic method to exchange the positions of two different elements in an
     * array.
     * @param a
     * @param i
     * @param j
     * @param <T>
     */
    public <T> void swap(T[] a, int i, int j){
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public <T> void swap(List<T> list, int i, int j){
        Collections.swap(list,i,j);
    }

    /**
     * task2
     */
    public final class Algorithm{
        //public static <T> T max(T x, T y){
          //  return x > y ? x : y;
            //the operator can't be used to compare x and y, since we dont know data types of x & y
       // }
    }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }

    /**
     *Write a generic method to find the maximal element in the range [begin, end) of a
     * list
     */
    public static <T extends Object & Comparable<? super T>> T max
        (List<? extends T> list, int begin, int end) {
        T max = list.get(begin);
        //lets assume that the largest element is in the beginning
        for (int i = begin + 1; i < end ; i++) {
            T t = list.get(i);
            if (t.compareTo(max) > 0){ //if t > max returns 1
                max = t;
            }
        }
        return max;
    }

    class Pair<M,W>{
        private M man;
        private W woman;

        public Pair(M man, W woman) {
            this.man = man;
            this.woman = woman;
        }

        public M getMan() {
            return man;
        }

        public void setMan(M man) {
            this.man = man;
        }

        public W getWoman() {
            return woman;
        }

        public void setWoman(W woman) {
            this.woman = woman;
        }
    }

    /**
     * check if the item is palindrome
     * @param list
     * @return
     * @param <T>
     */
    public static <T extends Object & Comparable<? super T>> int palindrome
            (List<? extends T> list) {
        int count = 0;
        for (int i = 0; i < list.size() ; i++) {
            T t = list.get(i);
            StringBuilder sb = new StringBuilder();
            sb = (StringBuilder) t;
            if (t.equals(((StringBuilder) t).reverse())){
                count++;
            }
        }
        return count;
    }

    /**
     * counts the number of odd numbers in a given collection
     * @param list
     * @return count
     * @param <T>
     */
    public static <T extends Number & Comparable<? super T>> int countOddNumbers
            (List<? extends T> list) {
        int count = 0;
        for (int i = 0; i < list.size() ; i++) {
            T t = list.get(i);
            if (t.intValue() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int number) {
        int count = 0;
        if (number > 2) {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * returns number of prime numbers in a given list
     * @param list
     * @return
     * @param <T>
     */

    public static <T extends Number & Comparable<? super T>> int checkPrimeNumber
            (List<? extends T> list) {
        int count = 0;
        for (int i = 0; i < list.size() ; i++) {
            T t = list.get(i);
           if (isPrime(t.intValue())){
               count++;
           }
        }
        return count;
    }


}
