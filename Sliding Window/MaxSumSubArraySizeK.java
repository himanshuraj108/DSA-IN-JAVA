import java.util.Scanner;

public class MaxSumSubArraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int maxSum = 0;

        // for (int i = 0; i < n - k + 1; i++) {
        // int sum = 0;
        // for (int j = i; j <= i + k - 1; j++) {
        // sum += arr[j];
        // }
        // maxSum = Math.max(maxSum, sum);
        // }

        int i = 0, j = k - 1;
        int sum = 0;
        for (int a = 0; a <= k - 1; a++) { // k times
            sum += arr[a];
        }
        i++;
        j++;
        while (j < n) { // n - k times
            sum = sum - arr[i - 1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        System.out.println(maxSum);

        sc.close();
    }
}