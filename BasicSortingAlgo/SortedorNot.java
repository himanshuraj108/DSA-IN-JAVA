package BasicSortingAlgo;

import java.util.Scanner;

public class SortedorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                check = false;
            }
        }

        if (check) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }

        sc.close();
    }

}
