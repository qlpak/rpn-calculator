package org.example;

import java.util.EmptyStackException;

public class Stack {
    private String[] elements;
    private int topOfStack;

    public Stack(int size) {
        elements = new String[size];
        topOfStack = -1;
    }

    public boolean isEmpty() {
        return topOfStack < 0;
    }

    public void push(String element) {
        if (topOfStack == elements.length - 1) {
            String[] newElements = new String[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }

            elements = newElements;
        }
        elements[++topOfStack] = element;
    }

    public String pop() {
        if (this.isEmpty())
            throw new EmptyStackException();
        return elements[topOfStack--];
    }

    public String peek() {
        if (this.isEmpty())
            throw new EmptyStackException();
        return elements[topOfStack];
    }

    public int size() {
        return topOfStack + 1;
    }
}
