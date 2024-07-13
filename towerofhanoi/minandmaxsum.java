import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        long[] arr = new long[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        Arrays.sort(arr);
        
        long minSum = 0, maxSum = 0;
        for (int i = 0; i < n - 1; i++) {
            minSum += arr[i];
        }
        for (int i = 1; i < n; i++) {
            maxSum += arr[i];
        }
        
        System.out.println("Minimum Sum: " + minSum);
        System.out.println("Maximum Sum: " + maxSum);
        
        scanner.close();
    }
}