import java.util.Scanner;

public class heap {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void minHeapify(int[] arr, int size, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[smallest] > arr[left]) {
            smallest = left;
        }
        if (right < size && arr[smallest] > arr[right]) {
            smallest = right;
        }

        if (smallest != i) {
            swap(arr, smallest, i);
            minHeapify(arr, size, smallest);
        }
    }

    public static void insert(int[] arr, int size, int val) {
        size++;
        int idx = size - 1;
        arr[idx] = val;

        while (idx > 0) {
            int parent = (idx - 1) / 2;
            if (arr[idx] < arr[parent]) {
                swap(arr, idx, parent);
                idx = parent;
            } else {
                break;
            }
        }
    }

    public static void deleteHeap(int[] arr, int size, int val) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == val) {
                break;
            }
        }
        if (i == size) {
            System.out.println("Element not found in the heap.");
            return;
        }

        arr[i] = arr[size - 1]; // Replace with the last element
        size--;

        // Restore heap properties
        minHeapify(arr, size, i);
    }

    public static void buildHeap(int[] arr, int size) {
        for (int i = (size - 1) / 2; i >= 0; i--) {
            minHeapify(arr, size, i);
        }
    }

    public static void heapSort(int[] arr, int size) {
        buildHeap(arr, size);

        for (int i = size - 1; i > 0; i--) {
            swap(arr, 0, i);
            minHeapify(arr, i, 0); // Rebuild the heap for the reduced array
        }
    }

    public static int Max(int arr[], int size) {
        if (size == 0) {
            System.out.println("Heap is empty");
        }

        // for find max ele
        int maxEle = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }

        // for find second Max
        int SecMax = arr[1];
        for (int i = 0; i < size; i++) {
            if (arr[i] != maxEle && arr[i] > SecMax) {
                SecMax = arr[i];
            }

        }
        return SecMax + maxEle;
    }

    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            insert(arr, i, ele);
        }

        System.out.println("Heap after building:");
        buildHeap(arr, n);
        display(arr, n);

        System.out.println("Sorted array:");
        heapSort(arr, n);
        display(arr, n);
        System.out.println("Max ele is: " + Max(arr, n));
        sc.close();
    }
}
