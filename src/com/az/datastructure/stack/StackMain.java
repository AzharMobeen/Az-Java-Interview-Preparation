package com.az.datastructure.stack;

import java.util.Stack;

public class StackMain {
    Stack<String> stack = new Stack<>();

    public static void main(String[] arg) {
        StackMain stackMain = new StackMain();

        String test = "Hello";
        // Lets add test String as char[] to String element of Stack
        stackMain.addElementsToStack(test);

        // Let's print stack elements
        stackMain.printStackElements();

        // push elements into Stack
        stackMain.pushElements(test);
        // checking specific object in stack
        System.out.println("e is available : " +stackMain.checkElement("H"));

        // Print last element
        System.out.println("Peek element is : " +stackMain.getPeekElement());
    }

    private void printStackElements() {
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private void pushElements(String str) {
        str.chars().mapToObj(ch ->(char) ch).forEach( ch -> stack.push(String.valueOf(ch)));
        System.out.println("Elements added to Stack : "+ stack.size());
    }

    private void addElementsToStack(String test) {

        test.chars().mapToObj(ch -> (char)ch).forEach(chr -> stack.push(String.valueOf(chr)));
    }

    private String getPeekElement() {
        return stack.peek();
    }

    private boolean checkElement(String str) {
        int index = stack.search(str);
        System.out.println("index : "+index);
        return (index > -1);
    }
}
