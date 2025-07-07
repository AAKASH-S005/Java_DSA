Split an array into two equal Sum subarrays
CODE :
import java.util.*;
public class TwoEqualSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int leftSum = 0;
        int splitPoint = -1;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            int rightSum = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                splitPoint = i + 1;
                break;
            }
        }
        if (splitPoint == -1 || splitPoint == n) {
            System.out.println("Not Possible");
        } else {
            for (int i = 0; i < n; i++) {
                if (i == splitPoint) {
                    System.out.println();
                }
                System.out.print(arr[i] + " ");
            }
        }
    }
}
