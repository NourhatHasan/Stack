package com.company;

public class LinkedList {
    Node head= new Node();
    Node tail= new Node();
    int size=0;

    public void insertion(int value){
        Node node=new Node();
        node.value=value;
        head=tail=node;
        node.next=null;
        size=1;
    }
    public void Insert(int value, int index){
        Node node=new Node();
        node.value=value;
        int in=0;
        if(head==null){
            insertion(value);
        }
        else if(index==0){
            Node temp= head;
            head=node;
            node.next=temp;
            size+=1;
        }
        else if(index ==size-1){

            tail.next=node;
            node.next=null;
            tail=tail.next;
            size+=1;
        }
        else {
            Node temp=head;

            while (in<index-1){
                temp=temp.next;
                in++;
            }
            Node next= temp.next;
            temp.next=node;
            node.next=next;
            size+=1;
        }

    }
    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("the lisrt is empty");
        } else {


            while (temp.next.next != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.print(temp.value);
            System.out.println();
        }
    }

    public String serch(int value){
        if(head==null){
            return "the list is empty";
        }
        Node temp=head;
        int index=0;
        while (temp!=null){
            if(temp.value==value){
                return "value of " +value+ " found in " +index;

            }
            index+=1;
            temp=temp.next;
        }
        return "value of "+value +" not found" ;
    }

    public  void delete(int value){
        if(head==null){
            System.out.println("something went wrong");
        }

        Node temp=head;
        Node prev= new Node();
        prev.next=temp;
        while(temp!=null){
            if(temp.value==value){
                prev.next=temp.next;
                size--;
                System.out.println("deleted");
            }

            prev=prev.next;
            temp=temp.next;
        }

    }

    public void delete2(int location){
        if(location==0){
            head=head.next;
            size--;
        }
        else if(location==size-1){
            Node  temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            //head.next=null;
            temp.next=null;

            size--;
        }
        else{
            Node prev=new Node();
            Node temp=head;
            prev.next=temp;
            int index=0;
            while (index<location){
                prev=temp;
                temp=temp.next;
                index++;

            }
            prev.next=temp.next;
            index--;
        }
    }

    public void clear()
    {
        while (head!=null){
            Node temp=head;
            head=null;
            temp=temp.next;


        }
    }
}
