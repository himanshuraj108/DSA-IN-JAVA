import java.util.Scanner;

public class ArrayQueue {
    public static class Queue {
        int f = 0;
        int r = 0;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Queue is full");
                return;
            }

            arr[r] = val;
            r = (r + 1) % arr.length;
            size++;
        }

        public int poll() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[f];
            f = (f + 1) % arr.length;
            size--;
            return val;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(f + i) % arr.length] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            q.add(ele);
        }

        q.poll();
        q.display();
        sc.close();
    }
}
