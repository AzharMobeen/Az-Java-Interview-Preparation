package com.az.datastructure.list;

public class CircularLinkedList {
    private Node firstNode;
    private Node lastNode;
    public CircularLinkedList(){
        firstNode = null;
        lastNode = null;
    }

    public boolean isEmpty() {
        return (firstNode == null);
    }

    // This will add every new node at start of list
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            lastNode = newNode;
        }
        newNode.nextNode = firstNode;   // new node --> old first node
        firstNode = newNode;            //
    }

    // This will add every new node at start of list
    public void insertLast(int data) {
        Node current = lastNode;

        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.nextNode = newNode;
            lastNode = newNode;
        }
    }

    public Node deleteFirst() {
        Node temp = firstNode;
        if(firstNode.nextNode == null) {
            lastNode = null;
        }
        firstNode = firstNode.nextNode;
        return temp;
    }

    public void displaySingleLinkedList() {
        System.out.println("<< This is First -> Last Node >>");
        Node current = firstNode;

        while (current != null) {
            current.displayNode();
            current = current.nextNode;
        }
        System.out.println("<< This is all SingleLinkedList >>");
    }
}
