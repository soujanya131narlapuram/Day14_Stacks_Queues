package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key){
        Node ptr = head;
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.displayQueue();
    }


    public void displayQueue(){
        Node ptr = head;
        if(head==null){
            System.out.println("Queue is Empty");
            return;
        }
        while(ptr != null){
            if(ptr.next !=null){
                System.out.print(ptr.key + "->");
            } else{
                System.out.print(ptr.key);
            }
            ptr = ptr.next;
        }

        System.out.println("");
    }

    public void pop(){
        if(head==null){
            System.out.println("Queue is Empty");
            return;
        }
        if(head != null){
            Node ptr = head;
            head = head.next;
            System.gc();
        }
        this.displayQueue();
    }
}