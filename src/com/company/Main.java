package com.company;

public class Main {

    public static void main(String[] args) {
        StacLinkedListClass list= new StacLinkedListClass();
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.traverse();
        list.pop();
        list.pop();
        list.traverse();
       list.peek();
       list.delete();
       list.traverse();




    }
}
