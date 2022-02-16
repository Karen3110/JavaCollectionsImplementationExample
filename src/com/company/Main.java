package com.company;

import com.company.collections.Stack;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);


        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString()); stack.pop();
        System.out.println(stack.toString());


    }



}
