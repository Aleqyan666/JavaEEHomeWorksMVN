package org.javaEEhomeworks.Homework_Lists;

import java.util.*;

public class ArrayListHomework {

    //task 3 / Write a Java program to update specific array element by given element
    public void changeSpecificElement(ArrayList arrayList, int index, Object object){
        arrayList.set(index,object);
    }

    //task 2 / Write a Java program to insert an element into the array list at the first position.
    public void addElement(ArrayList arrayList, int index, Object object){
        arrayList.add(index, object);
    }

    //task 4 / Write a Java program to search an element in a array list
       public void containsElement(ArrayList arrayList, Object object){
        if (arrayList.contains(object)){
            System.out.println("found!");
        }else{
            System.out.println("not found");
        }
       }

    //task 5 / Write a Java program to copy one array list into another
    public void copyList(ArrayList arrayList, ArrayList arrayList2){
        Collections.copy(arrayList, arrayList2);
    }

    //task8 / Write a Java program to test an array list is empty or not.
        public void checkListIsEmpty(ArrayList arrayList){
                if (arrayList.isEmpty()){
                    System.out.println("empty");
                }else{
                    System.out.println("non-empty");
                }
        }


    /**
     * test9
     * @param arrayList
     * @param expansion
     */
        public void myEnsureCapacity(ArrayList arrayList, int expansion){
            arrayList.ensureCapacity(expansion);
        }

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

    //task6 / Write a Java program to reverse elements in a array list
       public void reverseElementsOfList(ArrayList arrayList){
        Collections.reverse(arrayList);
       }

    //task7 / Write a Java program of swap two elements in an array lis
       public void swapElementsOfArraylist(ArrayList arrayList, int elementIndex, int updatedIndex){
            Collections.swap(arrayList, elementIndex, updatedIndex);
       }

    //task 11/ Write a Java program to iterate a linked list in reverse order
    public void linkedListReverseIteration(LinkedList list) {
        for (int i = list.size() - 1; i <= 0; i--) {
            System.out.println(list.get(i));
        }
    }


    //task10 / Write a Java program to iterate through all elements in a linked list.
    public void iterateThroughAllLinkedListElements(LinkedList<String> list) {
        for (String elementsOfList : list) {
            System.out.println(elementsOfList);
        }
    }
    //task 12/ Write a Java program to insert elements into the linked list at the first and last
    //position
    public void insertLastAndFirstElements(LinkedList linkedList, int firstChange, int lastChange){
        linkedList.addFirst(firstChange);
        linkedList.addLast(lastChange);
    }

    //task13/ Write a Java program to insert the specified element at the end of a linked list
    public void insertSpecifiedInTheEnd(LinkedList list) {
        Collections.swap(list, 2, list.size() - 1);
    }



    // task14 /Write a Java program to remove first and last element from a linked list
    public void removeLastAndFirstElementsOfLinkedList(LinkedList list){
        list.removeFirst();
        list.removeLast();
    }

    //task 15 / Write a Java program to clone an linked list to another linked list.
    public void cloneLists(LinkedList list, LinkedList clonedList){
     clonedList = (LinkedList) list.clone();
    }


    //task16 / Write a Java program to test an linked list is empty or not.
    public boolean linkedListEmpty(LinkedList list){
        if (list.isEmpty()){
            return true;
        }
        return false;
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

       //delete
        ArrayList<Integer> nums2 = new ArrayList<>();
        Collections.copy(nums,nums2);

        LinkedList<String> country = new LinkedList<>();
        country.add("Brazil");
        country.add("USA");
        country.add("UK");







    }
}
