Operations Performed on the Stack:

Query-1(Denoted by an integer 1): Pushes an integer data to the stack.
Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.
Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.
Query-4(Denoted by an integer 4): Returns the current size of the stack.
Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.

Input Format

The first line contains an integer 'q' which denotes the number of queries to be run against each operation in the stack.
Then the test cases follow.
Every 'q' lines represent an operation that needs to be performed.
For the push operation, the input line will contain two integers separated by a single space, representing the type of the operation in integer and the integer data being pushed into the stack.
For the rest of the operations on the stack, the input line will contain only one integer value, representing the query being performed on the stack.

CODE :

import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node topNode;
    private int stackSize;
    
    public Stack() {
        this.topNode = null;
        this.stackSize = 0;
    }
    
    // Query-1: Push an element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = topNode;
        topNode = newNode;
        stackSize++;
    }
    
    // Query-2: Pop and return the top element
    public int pop() {
        if (topNode == null) {
            return -1; // Stack is empty
        }
        int poppedData = topNode.data;
        topNode = topNode.next;
        stackSize--;
        return poppedData;
    }
    
    // Query-3: Peek (return the top element without removing it)
    public int peek() {
        if (topNode == null) {
            return -1; // Stack is empty
        }
        return topNode.data;
    }
    
    // Query-4: Return stack size
    public int size() {
        return stackSize;
    }
    
    // Query-5: Check if stack is empty
    public boolean isEmpty() {
        return topNode == null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        
        int queries = sc.nextInt(); // Number of queries
        for (int i = 0; i < queries; i++) {
            int queryType = sc.nextInt();
            
            switch (queryType) {
                case 1: // Push
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2: // Pop
                    System.out.println(stack.pop());
                    break;
                case 3: // Peek
                    System.out.println(stack.peek());
                    break;
                case 4: // Size
                    System.out.println(stack.size());
                    break;
                case 5: // Is Empty
                    System.out.println(stack.isEmpty());
                    break;
                default:
                    System.out.println("Invalid query");
            }
        }
    }
}
