package com.az.datastructure.list;

public class SinglyLinkedList {
    private Node firstNode;
    public SinglyLinkedList(){}

    public boolean isEmpty() {
        return (firstNode == null);
    }

    // This will add every new node at start of list
    public void insertFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = firstNode;
        firstNode = node;
    }

    // This will add every new node at start of list
    public void insertLast(int data) {
        Node current = firstNode;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.nextNode = newNode;
    }

    public Node deleteFirst() {
        Node temp = firstNode;
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
