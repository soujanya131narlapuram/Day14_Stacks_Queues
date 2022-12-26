package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        System.out.println("Stack after pushing 70");
        stack.push(70);
        System.out.println("Stack after pushing 30");
        stack.push(30);
        System.out.println("Stack after pushing 56");
        stack.push(56);


        System.out.println("Pop 56 from stack");
        stack.pop();
        stack.peak();
        System.out.println("Pop 30 from stack");
        stack.pop();
        stack.peak();
        System.out.println("Pop 70 from stack");
        stack.pop();
        stack.peak();
    }
}
