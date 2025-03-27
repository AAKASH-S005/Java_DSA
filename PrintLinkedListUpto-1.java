First take a linkedList and then try to print that LinkedList
Sample Input : 1 2 3 4 5 -1
Sample Output : 1 2 3 4 5
Print the list upto when it reaches -1

CODE :

import java.io.*;
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head = null;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); 
            temp = temp.next;
        }
        System.out.println(); 
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            int value = s.nextInt();
            if (value == -1) { 
                break;
            }
            list.insert(value);
        }
        list.display();
    }
}
