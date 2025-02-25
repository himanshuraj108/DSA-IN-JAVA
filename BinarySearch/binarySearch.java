import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = n - 1;
        int key = sc.nextInt();
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;
            // mid = start + (end - start)/2

            if (arr[mid] == key) {
                found = true;
                break;
            }

            else if (arr[mid] < key) {
                start = mid + 1;
            }

            else if (arr[mid] > key) {
                end = mid - 1;
            }

        }

        if (found) {
            System.out.println("Target Present");
        }

        else {
            System.out.println("Target not Present");
        }

        sc.close();
    }
}