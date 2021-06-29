package com.az.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMain {

    Queue queue = new PriorityQueue();
    Deque deque = new ArrayDeque();

    public static void main(String[] arg) {
        QueueMain queueMain = new QueueMain();
        String test = "Hello";
        // Let's add test String as char[] in priorityQueue.
        queueMain.addElementsToPriorityQueue(test);
        // Let's print Hello from priorityQueue.
        queueMain.printElementsFromPriorityQueue();
        // adding again for other functions
        queueMain.addElementsToPriorityQueue(test);
        queueMain.getPeekElementFromPriorityQueue();
    }

    private void getPeekElementFromPriorityQueue() {
        System.out.println("Peek element is : "+queue.peek());
    }

    private void addElementsToPriorityQueue(String test) {
        test.chars().mapToObj(ch -> (char)ch).forEach(chr -> queue.add(chr));
        System.out.println("All Elements added to PriorityQueue :" +queue.size());
    }

    private void printElementsFromPriorityQueue() {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
