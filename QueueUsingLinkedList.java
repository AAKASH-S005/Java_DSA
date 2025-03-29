Queue using Linked List in Java

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

class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data); // Fix: Pass data to constructor
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // Handle empty queue case
        }
        int dequeuedValue = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeuedValue;
    }

    public int front() {
        return isEmpty() ? -1 : front.data; // Fix: Return front data
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Queue queue = new Queue();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            switch (queryType) {
                case 1: // Enqueue operation
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;

                case 2: // Dequeue operation
                    result.append(queue.dequeue()).append("\n");
                    break;

                case 3: // Get front element
                    result.append(queue.front()).append("\n");
                    break;

                case 4: // Get size
                    result.append(queue.getSize()).append("\n");
                    break;

                case 5: // Check if empty
                    result.append(queue.isEmpty() ? "true" : "false").append("\n");
                    break;
            }
        }
        
        System.out.print(result.toString()); // Print collected results
    }
}
