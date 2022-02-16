package com.company.collections;

import com.company.collections.collectionsUtil.Node;

/***
 * Queue -> FIFO (First Input First Output)
 * @param <T> any type for initializing Collections info type
 */
public class Queue<T> {
    private Node<T> back;
    private Node<T> front;
    private int size;


    public Queue() {
        back = front = null;
        size = 0;
    }

    public void push(T val) {

    }

    public T pop() {
        return (T) new Object();
    }

    public T front() {
        return front.getInfo();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
