package com.company.collections;

import com.company.collections.collectionsUtil.Node;

public class Stack {
    private Node top; // {null,info,null}
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

    public void push(int val) {
        if (top == null) {
            top = new Node(val, null, null);
        } else {
            Node temp = top;
            top = new Node(val, temp, null);
            temp.setNext(top);
        }
        size++;
    }

    public int top() {
        return top.getInfo();
    }


    public int pop() {
        if (size == 0) {
            try {
                throw new Exception("you can't remove element from empty Stack, modify your code");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int temp = top.getInfo();
            top = null;
            size--;


            return temp;
        } else {
            Node temp = top;
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
            Node temp = top;
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
