// Leetcode problem (4) -> Median of two sorted Arrays

import java.util.*;
public class MedianOfTwoSortedArrays{
    public static void main(String[] args){
        int[] a = {1,2};
        int[] b = {3,4};
        int n = a.length+b.length;
        int[] newArr = new int[n];
        for(int i=0;i<a.length;i++){
            newArr[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            newArr[a.length+i] = b[i];
        }
        if(n%2 == 1){
            System.out.println("Median is "+newArr[n/2]);
        }
        else{
            System.out.println("Median is "+(newArr[n/2-1]+newArr[n/2])/2.0);
        }
    }
}
