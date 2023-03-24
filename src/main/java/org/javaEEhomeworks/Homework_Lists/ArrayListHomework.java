package org.javaEEhomeworks.Homework_Lists;

import java.util.*;

public class ArrayListHomework {

    /** //task 17/
     * Write a program that reads from the console a  sequence of positive integer
     * numbers. The sequence  ends when empty line is entered. Calculate and print  the
     * sum and average of the elements of the  sequence. Keep the sequence in
     * ArrayList<int>.
     */

    public void averageOfNumbers(){

    }

    /** task18
     *sort in increasing order
     */
    public void sortInIncreasingOrder(ArrayList<Integer> arrayList){
       Collections.sort(arrayList);
    }


    /** task19
     *remove negative numbers
     */
    public ArrayList<Integer> removeNegativeFromAL(ArrayList<Integer> arrayList){
        ArrayList<Integer> finalAList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++){
            if (arrayList.get(i) >= 0){
                finalAList.add(arrayList.get(i));
            }
        }
        return finalAList;
    }

    /** task20
     *Write a program that removes from given sequence  all numbers that occur odd
     * number of times
     */

//    public ArrayList<Integer> retainOnlyEvenOccurrences(ArrayList<Integer> arrayList){
//        ArrayList<Integer> finalArrayList = new ArrayList<>();
//        System.arraycopy(arrayList,0,finalArrayList,0,arrayList.size());
//        int temp = 0;
//        int count = 0;
//        for (int i = 0; i < arrayList.size(); i++){
//            if (arrayList.get(i) == )
//            count += 1;
//        }
//    }



    public static void main(String[] args) {
        //task 1 / Write a Java program to iterate through all elements in a array list
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        ListIterator<Integer> iterate = nums.listIterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next() + ", ");
        }
        //task 2 / Write a Java program to insert an element into the array list at the first position.
        nums.add(0,25);

        //task 3 / Write a Java program to update specific array element by given element
        nums.set(0,6);

        //task 4 / Write a Java program to search an element in a array list
        if (nums.contains(2)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

        //task 5 / Write a Java program to copy one array list into another
        ArrayList<Integer> nums2 = new ArrayList<>();
        Collections.copy(nums,nums2);


        //task6 / Write a Java program to reverse elements in a array list
       Collections.reverse(nums2);

       //task7 / Write a Java program of swap two elements in an array lis
        Collections.swap(nums2,0,1);

        //task8 / Write a Java program to test an array list is empty or not.
        nums2.isEmpty();

        //task9
        nums2.ensureCapacity(10);

        //task10 / Write a Java program to iterate through all elements in a linked list.
        LinkedList<String> country = new LinkedList<>();
        country.add("Brazil");
        country.add("USA");
        country.add("UK");
        for (String list: country){
            System.out.println(list);
        }
        //task 11/ Write a Java program to iterate a linked list in reverse order
        for (int i = country.size() - 1; i <= 0; i--){
            System.out.println(country.get(i));
        }
        //task 12/ Write a Java program to insert elements into the linked list at the first and last
        //position.
        country.addFirst("Canada");
        country.addLast("Georgia");

        //task13/ Write a Java program to insert the specified element at the end of a linked list
        Collections.swap(country,2,country.size()-1);

        // task14 /Write a Java program to remove first and last element from a linked list
        country.removeFirst();
        country.removeLast();

        //task 15 / Write a Java program to clone an linked list to another linked list.
        LinkedList<String> newCountries = new LinkedList<>();
        newCountries = (LinkedList<String>) country.clone();

        //task16 / Write a Java program to test an linked list is empty or not.
        newCountries.isEmpty();



    }
}
