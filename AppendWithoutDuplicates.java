Append without Duplicates in Linked list using Java

CODE :

import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){               // Parameterized constructor for creating objects(Instance) of that class
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head=null;
    void insert(int d){
        Node ob=new Node(d);
        if(head==null){
            head=ob;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==d){
                break;
            }
            temp=temp.next;
        }
        if(temp.data!=d){
             temp.next=ob;
        }
    }
    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
}

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList list=new LinkedList();
        while(true){                                  //Infinite while loop
            int value=s.nextInt();
            if(value==-1){
                break;
            }
            list.insert(value);
        }
        list.display();
    }
}
