Java code to print Unique Elements in an Array
CODE :
import java.util.*;
public class PrintUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int f = 0;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    f = 1;  
                    break;
                }
            }
            if (f == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
