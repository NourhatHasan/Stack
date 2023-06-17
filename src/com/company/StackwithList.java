package com.company;

public class StackwithList {

    int [] arr;
    int topOfStack;


    //creation of stack
    public StackwithList(int size){
        this.arr=new int[size];
        this.topOfStack=-1;
        System.out.println
                ("the stack is created with size of "+size);
    }
    //isEmpty method
    public boolean isEMptyCheck(){
        if(topOfStack!= -1){
            return  false;
        }
        return true;
    }
    //isFull method
    public boolean isFullcheck(){
        if(arr.length==topOfStack){
            return true;
        }
        return false;
    }

    //push
    public void push(int value){
        if(arr.length== topOfStack){
            System.out.println("the stack is full");
        }
        else {
            arr[topOfStack + 1] = value;
            topOfStack += 1;
            System.out.println("the value " +  arr[topOfStack] +" is inserted");
        }
    }


    public void pop(){
        if(topOfStack==-1){
            System.out.println("the stack is empty");
        }
        else{


            System.out.println("the value " + arr[topOfStack] +" is popped");
            topOfStack--;
        }
    }

    public void peek(){
        if(topOfStack==-1){
            System.out.println("the stack is empty");
        }
        else{
            System.out.println("the value " + arr[topOfStack] +" is peeked");
        }
    }
}

