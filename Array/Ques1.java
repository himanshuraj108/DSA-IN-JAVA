package Array;

import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) { // also can use n(size) instead of .length
            if (arr[i] < 35) {
                System.out.println("Roll. No:- " + i + "\tMarks " + arr[i]);
            }
        }

        sc.close();

    }
}
