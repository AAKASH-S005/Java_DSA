Queue using Array in java

CODE :

import java.io.*;
import java.util.*;

class Queue{
    int[] q;
    int size, front, rear;
    
    Queue(int size){
        this.size = size;
        this.q = new int[size];
        this.front = 0;
        this.front = 0;
    }
    
    void enQueue(int val){
        if(rear < size){
            q[rear++] = val;
        }
        else{
            System.out.println("Queue is Full");
        }
    }
    
    void display(){
        for(int i=front;i<rear;i++){
            System.out.print(q[i]+" ");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue queue = new Queue(n);
        for(int i=0;i<n;i++){
            queue.enQueue(sc.nextInt());
        }
        queue.display();
    }
}
