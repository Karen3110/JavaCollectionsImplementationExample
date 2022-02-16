package com.company.collections;

import com.company.collections.collectionsUtil.Node;

/***
 * Stack -> LIFO (Last Input First Output)
 * @param <T> any type for initializing Collections info type
 */
public class Stack<T> {
    private Node<T> top; // {null,info,null}
    private int size;

    public Stack() {
        this.top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T val) {
        if (top == null) {
            top = new Node<T>(val, null, null);
        } else {
            Node<T> temp = top;
            top = new Node<T>(val, temp, null);
            temp.setNext(top);
        }
        size++;
    }

    public T top() {
        return top.getInfo();
    }


    public T pop() {
        if (size == 0) {
            try {
                throw new Exception("you can't remove element from empty Stack, modify your code");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return (T) new Object();
        }
        if (size == 1) {
            T temp = top.getInfo();
            top = null;
            size--;


            return temp;
        } else {
            Node<T> temp = top;
            top = top.getPrev();
            top.setNext(null);
            temp.setPrev(null);
            size--;

            return temp.getInfo();

        }


    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("Stack{\t");

        if (size == 0) {
            s.append("no data, ");
        } else if (size == 1) {
            s.append("{").append(top.getInfo()).append("}, ");
        } else {
            Node<T> temp = top;
            while (temp.getPrev() != null) {
                temp = temp.getPrev();
            }
            while (temp != null) {
                s.append("{").append(temp.getInfo()).append("}, ");
                temp = temp.getNext();

            }
        }


        s.append("size=").append(size).append("\t}");

        return s.toString();
    }
}
