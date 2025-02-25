package Array;

import java.util.Scanner;

public class MergeTwoSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] ARR = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr[i] <= arr2[j]) {
                ARR[k] = arr[i];
                i++;
                k++;
            }

            else {
                ARR[k] = arr2[j];
                j++;
                k++;

            }
        }

        if (i == arr2.length) {
            while (j < arr.length) {
                ARR[k] = arr2[j];
                j++;
                k++;
            }
        }

        if (j == arr.length) {
            while (i < arr.length) {
                ARR[k] = arr[i];
                i++;
                k++;
            }
        }

        for (int ele : ARR) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
