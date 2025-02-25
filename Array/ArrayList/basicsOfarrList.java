package Array.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class basicsOfarrList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            arr.add(ele); // push_back like C++
        }

        // for (int ele : arr) {
        // System.out.print(ele + " ");
        // }

        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " "); // arr[i]
        }

        System.out.println();
        // arr.add(3, 5); // add ele at idx with size++
        // arr.set(2, 5); // add ele on idx with same size;
        arr.remove(1); // for remove or delete idx
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }

}
