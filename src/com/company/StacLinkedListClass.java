package com.company;

public class StacLinkedListClass {
    LinkedList list;
public StacLinkedListClass(){
    list= new LinkedList();
}
    public boolean isEmptyCheck(){
        if(list.head==null){
            return true;
        }
        return false;
    }

    public void push(int value){
        list.Insert(value,0);
        System.out.println("inserted "+value );
        list.size++;
    }

    public void pop(){
    if(list.head==null){
        System.out.println( "the stack is tom");
    }
    else {
        Node temp = list.head;
        // list.head = list.head.next;
        // list.delete(list.head.value);
        list.delete2(0);
        System.out.println(temp.value);
        //list.size--;
      }
   }

   public void peek(){
       if(list.head==null){
           System.out.println( "the stack is tom");
       }
       else{
           Node temp = list.head;
           System.out.println(temp.value);
       }
   }
   public void delete(){
    list.head=null;
    list.size=0;
       System.out.println("the stack is deleted");
   }
    public void traverse(){
    if(list.head==null){
        System.out.println("the list is empty");
    }
        Node temp=list.head;
        while (temp!=null){

            System.out.print(temp.value +" ");
            temp=temp.next;
            list.size--;
        }
        System.out.println();
    }
}
