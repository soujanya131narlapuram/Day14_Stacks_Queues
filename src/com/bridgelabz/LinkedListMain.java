package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("Queue after pushing 56");
        queue.push(56);
        System.out.println("Queue after pushing 30");
        queue.push(30);
        System.out.println("Queue after pushing 70");
        queue.push(70);
        System.out.println("");

        System.out.println("Pop 56 from Queue");
        queue.pop();
        System.out.println("Pop 30 from Queue");
        queue.pop();
        System.out.println("Pop 70 from Queue");
        queue.pop();
    }
}
