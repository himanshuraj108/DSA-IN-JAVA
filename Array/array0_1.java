package Array;

import java.util.Scanner;

public class array0_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0, j = n - 1;
        while (i < j) {
            while (i < j && arr[i] == 0)
                i++;
            while (i < j && arr[j] == 1)
                j--;
            if (i < j) {
                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
