Doubly Linked List using Java

CODE :

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    Node head = null;
    Node tail = null;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void display(){
        Node temp = head;                  // temp = head; -> for forward print
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;              // temp = temp.next -> for forward print
        }
    }
}
public class Solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        while (true) { 
            int val = sc.nextInt();
            if(val == -1){
                break;
            }
            list.insert(val);
        }
        list.display();
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Doubly Linked List Print in reverse order

CODE : 

import java.util.*;
import java.io.*;

class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList{
    Node head = null;
    Node tail = null;
    void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void display(){
        Node temp = tail;                  // temp = tail; -> for reverse print
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;              // temp = temp.prev -> for reverse print
        }
    }
}
public class Solution2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        while (true) { 
            int val = sc.nextInt();
            if(val == -1){
                break;
            }
            list.insert(val);
        }
        list.display();
    }
}
