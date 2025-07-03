1) Singly Linked List -> Insert at Beginning
CODE :
import java.util.*;
public class LLInsertAtBeg{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        if(head == null){
            System.out.print("List is Empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List : ");
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LLInsertAtBeg list = new LLInsertAtBeg();
        System.out.print("How many numbers that you want to Insert : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            list.insertAtBeg(num);
        }
        list.display();
    }
}
__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
2) Singly Linked List -> Insert At End
CODE :
import java.util.*;
public class LLInsertAtEnd{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void insertAtEnd(int data){
      Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
          current.next = newNode;
        }
    }
    public void display(){
        if(head == null){
            System.out.print("List is Empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List : ");
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LLInsertAtEnd list = new LLInsertAtEnd();
        System.out.print("How many numbers that you want to Insert : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            list.insertAtEnd(num);
        }
        list.display();
    }
}
__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________
3) Singly Linked List -> Insert at Specific Position
CODE :
