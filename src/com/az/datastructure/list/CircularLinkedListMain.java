package com.az.datastructure.list;

public class CircularLinkedListMain {

    public static void main(String[] arg) {
        CircularLinkedList singlyLinkedList = new CircularLinkedList();
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertFirst(20);
        singlyLinkedList.insertFirst(30);
        singlyLinkedList.insertFirst(40);
        singlyLinkedList.displaySingleLinkedList();
        singlyLinkedList.insertLast(100);
        singlyLinkedList.displaySingleLinkedList();
    }
}
