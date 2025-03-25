// All Stack operations on Java

import java.util.*;
class Node 
{
    int data;
    Node next;
}
public class StackOperations{
   public static void push(Node head)          // Insert (or) Push elements in stack
    {
        System.out.println("Enter the Elements to Push onto the stack : ");
        Scanner sc = new Scanner(System.in);
        Node obj = new Node();
        obj.data = sc.nextInt();
        obj.next=head.next;
        head.next=obj;
    }
    public static void pop(Node head)          // Delete(or) Pop elements in stack
    {
        System.out.println("       ");
        System.out.println("After popping the First element of the stack : ");
        if(head.next!=null)
        head.next=head.next.next;
    }
   public static void peek(Node head)          // Return the First element in stack
    {
        System.out.println("       ");
        if(head.next!=null)
        System.out.println("Peek element of the Stack is "+head.next.data);
    }
   public static void size(Node head)          // Return the Size of the stack
    {
        int c = 0;
        Node temp = head.next;
        while(temp!=null)  
        {
            c++;
            temp = temp.next;
        }
        System.out.println("       ");
        System.out.println("Size of the Stack is "+c);
    }
    public static void isEmpty(Node head)      // To compute whether the Stack is Empty or not
    {
        if(head.next==null)
        System.out.println("Stack is Empty");
        else
           System.out.println("Stack is Not Empty");
    }
    public static void isFull(Node head)       // To compute whether the Stack is Full or not
    {
        System.out.println("Enter the Size : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int l=0;
        Node t=head.next;
        while(t!=null)
        {
            l++;
            t=t.next;
        }
        if(l<size)
        {
            System.out.println("Not full");
        }
        else{
            System.out.println("Stack is Full");
        }
    }
    public static void display(Node head)
    {
        Node temp = head.next;
        while(temp!=null)
        {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    }
    public static void main (String[] args) 
    {
        Node head = new Node();
        head.next=null;
        System.out.println("Enter the value n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            push(head);
        }
        display(head);
        System.out.println("       ");
        pop(head);
        display(head);
        System.out.println("       ");
        size(head);
        System.out.println("       ");
        isEmpty(head);
        System.out.println("       ");
        isFull(head);
        peek(head);
        System.out.println("       ");
    }
}

