import java.util.Scanner;

public class mergeSort {

    public static void merge(int a[], int b[], int res[]) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        while (i < a.length) {
            res[k++] = a[i++];
        }

        while (j < b.length) {
            res[k++] = b[j++];
        }
    }

    public static void mergesort(int res[]) {
        int n = res.length;
        if (n <= 1) {
            return;
        }

        int n1 = n / 2;
        int n2 = n - n1;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = res[i];
        }

        for (int i = 0; i < n2; i++) {
            b[i] = res[n1 + i];
        }

        mergesort(a);
        mergesort(b);
        merge(a, b, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] res = new int[a.length + b.length];
        merge(a, b, res);
        System.out.println("Merged and sorted array: ");
        for (int ele : res) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
