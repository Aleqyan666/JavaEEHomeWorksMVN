package org.javaEEhomeworks.homework_queue_dequeue;

import java.util.*;

public class QueueHomework {

    /**
     * Remove elements from a queue until it is empty.
     * @param queue
     */
    public static void removeFromQueueUntilEmpty(Queue queue){
        while (queue.size() != 0){
            queue.remove();
        }
    }

    /**
     * Remove elements from a dequeue until it is empty.
     * @param deque
     */

    public static void removeFromDeQueueUntilEmpty(Deque deque){
        while (deque.size() != 0){
            deque.remove();
        }
    }

    /**
     *
     * @param queue
     * @param object
     * @return true if contains the element
     */
    public boolean checkIfQueueContains(Queue queue, Object object){
        if (queue.contains(object)){
            return true;
        }
        return false;
    }

    /**
     *
     * @param deque
     * @param object
     * @return true if contains the element
     */
    public boolean checkIfDequeContains(Deque deque, Object object){
        if (deque.contains(object)){
            return true;
        }
        return false;
    }

    public void addColors(PriorityQueue<String> priorityQueue, String color ){
        priorityQueue.add(color);
        System.out.println(priorityQueue);
    }

    public void addAllElementsTOAnotherPriorityQueue(PriorityQueue first, PriorityQueue second){
          second.addAll(first);
    }
    public static void main(String[] args) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(8);

        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("Brazil");
        stringPriorityQueue.add("USA");
        stringPriorityQueue.add("France");
        stringPriorityQueue.add("UK");

        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        removeFromQueueUntilEmpty(queue);

        ArrayDeque arrayDeque = new ArrayDeque<>();
        arrayDeque.add(2);
        arrayDeque.add("Steve");
        arrayDeque.add(Float.MIN_VALUE);


        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>();
        Student student = new Student("John","Carter",16);
        Student student2 = new Student("Karen","Lopez",17);
        Student student3 = new Student("Albert","Santiago",18);
//        priorityQueue1.add(student);
//        priorityQueue1.add(student2);
//        priorityQueue1.add(student3);

    }

   static class Student{
        public String name;
        public String lastName;
        public int age;

       public Student(String name, String lastName, int age) {
           this.name = name;
           this.lastName = lastName;
           this.age = age;
       }
   }
}
