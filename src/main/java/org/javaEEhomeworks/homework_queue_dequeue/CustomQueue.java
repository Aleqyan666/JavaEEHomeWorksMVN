package org.javaEEhomeworks.homework_queue_dequeue;

import java.util.Queue;



class QueueNode{
    int key;
    QueueNode next;

    public QueueNode(int key) {
        this.key = key;
        this.next = null;
    }
}

public class CustomQueue {
    QueueNode front, rear;

    public CustomQueue(QueueNode front, QueueNode rear) {
        this.front = null;
        this.rear = null;
    }

    public void addKey(int key){
        QueueNode temporary = new QueueNode(key);

        if (this.rear == null){
            this.front = this.rear = temporary;
        }

        this.rear.next = temporary;
        this.rear = temporary;
    }

    public void removeKey(){
        while (this.front == null) {
            break;
        }

        QueueNode temp = this.front;
        this.front = this.front.next;

        if (this.front == null){
            this.rear = null;
        }
    }
}
