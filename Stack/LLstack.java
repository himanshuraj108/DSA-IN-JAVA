import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LLstack {
    Node head = null;
    int size = 0;

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int size() {
        return size;
    }

    int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;

    }

    int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = head.val;
        return x;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    void display() {
        displayRec(head);
    }

    void displayRec(Node head) {
        if (head == null) {
            return;
        }
        displayRec(head.next);
        System.out.print(head.val + " ");
        // displayRec(head.next); for reverse
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLstack st = new LLstack();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }
        st.pop();
        st.display();
        sc.close();
    }
}
