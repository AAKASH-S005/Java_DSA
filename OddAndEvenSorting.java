Array Sorting
Input : n=6 {1,2,3,4,5,6}
Output : {1,3,5,6,4,2}
Explanation : Odd numbers sorted in Ascending order and Even numbers sorted in Descending order

CODE :
import java.util.*;
public class OddAndEvenSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int oddCount = 0, evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];
        int oi = 0, ei = 0;
        for (int num : arr) {
            if (num % 2 == 0) even[ei++] = num;
            else odd[oi++] = num;
        }
        Arrays.sort(odd);
        for(int i=0;i<evenCount-1;i++){
            for(int j=0;j<evenCount-1-i;j++){
                if(even[j] < even[j+1]){
                    int t = even[j];
                    even[j] = even[j+1];
                    even[j+1] = t;
                }
            }
        }
        for (int i = 0; i < odd.length; i++) {
            System.out.print(odd[i] + " ");
        }
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
    }
}
