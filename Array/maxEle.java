package Array;

import java.util.*;

public class maxEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int SecMax = Integer.MIN_VALUE; // arr[0]==max?arr[1]:arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i] > SecMax) {
                SecMax = arr[i];
            }
        }
        System.out.println(SecMax);

        sc.close();
    }
}
