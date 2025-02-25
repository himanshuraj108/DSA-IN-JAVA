
package Array;

import java.util.Scanner;

public class NextGreatestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans[n - 1] = -1;

        // for (int i = 0; i < n - 1; i++) {
        // int mx = Integer.MIN_VALUE;
        // for (int j = i + 1; j < n; j++) {
        // mx = Math.max(mx, arr[j]);
        // }
        // ans[i] = mx;
        // }
        // for (int ele : arr) {
        // System.out.print(ele + " ");
        // }
        // System.out.println();
        // for (int ele : ans) {
        // System.out.print(ele + " ");
        // }

        // METHOD - 2

        int nge = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}
