package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        this.displayStack();
    }


    public void displayStack(){              // UC1
        Node ptr = head;   // ptr = pointer

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
        if(head != null){
            Node ptr = head;
            head = head.next;
            System.gc();
        }
        this.displayStack();
    }

    public void peak(){
        if(head != null){
            System.out.println("Top element in the stack is " + head.key);
        } else{
            System.out.println("stack is empty");
        }
    }

}