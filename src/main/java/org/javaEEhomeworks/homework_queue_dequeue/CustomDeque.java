package org.javaEEhomeworks.homework_queue_dequeue;

public class CustomDeque {
    static class Node{
        int data;
        Node prev, next;

        static Node getNode(int data){
            Node newNode = new Node();
            newNode.data = data;
            newNode.prev = newNode.next = null;
            return newNode;
        }
    }

    static class Deque{
        Node front, rear;
        int size;

        public Deque() {
            front = rear = null;
            size = 0;
        }

        /**
         * checks if the deque is empty
         * @return true/false
         */
        boolean isEmpty(){
            if (front == null){
                return true;
            }else{
                return false;
            }
        }

        /**
         * returns number of element
         * @return size
         */
        int size(){
            return size;
        }
        void insertFront(int data) {
            Node newNode = Node.getNode(data);
            if (newNode == null)
                System.out.print("Element can't be added");
            else {
                if (front == null)
                    rear = front = newNode;

                else {
                    newNode.next = front;
                    front.prev = newNode;
                    front = newNode;
                }
                size++;
            }
        }

        void deleteFront()
        {
            // If deque is empty then
            // 'Underflow' condition
            if (isEmpty()) {
                System.out.print("Empty!");
            }else {

                Node temp = front;
                front = front.next;
            }
                if (front == null){
                    rear = null;

                }
                else {
                    front.prev = null;
                }
                size--;
            }

        void deleteRear() {

            if (isEmpty()) {
                System.out.print("Empty");

            } else {
                Node temp = rear;
                rear = rear.prev;
            }

                if (rear == null){
                    front = null;
            }else{
                    rear.next = null;
                }
                size--;
            }

            public int getFront(){
            if (isEmpty()){
                System.out.println("empty");
            }
            return front.data;
            }

            public int getRear(){
            if (isEmpty()){
                System.out.println("empty");
            }
            return rear.data;
            }

            void erase(){
                rear = null;
                while (front != null){
                    Node temp = front;
                    front = front.next;
                }
                size = 0;
            }
        }
}



