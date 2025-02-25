package Array;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ele = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
