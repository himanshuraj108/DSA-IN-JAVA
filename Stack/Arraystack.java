import java.util.Scanner;

public class Arraystack {
    int[] arr;
    int idx = 0;
    int size;

    public Arraystack(int size) {
        this.size = size;
        arr = new int[size];
    }

    boolean isFull() {
        return arr.length == idx;
    }

    void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = val;
        idx++;
    }

    void pop() {
        if (idx == 0) {
            System.out.println("Stack is empty");
            return;
        }
        idx--;
    }

    int peek() {
        if (idx == 0) {
            System.out.println("The stack is empty");
            return -1;
        }
        return arr[idx - 1];
    }

    void display() {
        for (int i = 0; i < idx; i++) {
            System.out.println(arr[i]);
        }
    }

    int size() {
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();

        Arraystack st = new Arraystack(n);

        System.out.println("Enter the elements to push onto the stack:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }
        sc.close();

        // Display stack elements
        st.display();
    }
}
