// Singly Linked List

import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    // we can take private but not complusory
    private int size; // for find size // size++ give below

    private Node tail;
    private Node head;

    void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;

        else {
            tail.next = temp;
            tail = temp;
        }
        size++; // for find size
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null)
            head = tail = temp;

        else {
            temp.next = head;
            head = temp;
        }
    }

    void insertAtPosition(int idx, int val) {
        Node temp = new Node(val);
        if (idx == 0) {
            insertAtHead(val);
        }

        if (idx == size) {
            insertAtEnd(val);
        }

        if (idx > size) {
            System.out.println("Invalid Index");
            return;
        }
        Node x = head;
        for (int i = 1; i <= idx; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
    }

    int get(int idx) throws Error {
        if (idx == size - 1)
            return tail.val;
        if (idx >= size || idx < 0) {
            System.out.println("Invalid index");
            throw new Error("Invalid Index");
        }

        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx, int val) throws Error {
        if (idx == size - 1)
            tail.val = val;
        if (idx >= size || idx < 0) {
            throw new Error("Invalid Index");
        }

        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void size() { // for printing size
        System.out.println(size);
    }

    void deleteAtHead() throws Error {
        if (head == null)
            throw new Error("List is empty");
        head = head.next;
        size--;
    }

    void deleteAtIndex(int idx) throws Error {
        if (idx == 0) {
            deleteAtHead();
        }
        if (head == null)
            throw new Error("List is empty");
        if (idx < 0 || idx >= size)
            throw new Error("Invalid Index");

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == tail)
            tail = temp;
        temp.next = temp.next.next;
        size--;
    }
}

public class implementation {

    public static void main(String[] args) {

        SLL ll = new SLL();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            ll.insertAtEnd(ele);
        }

        ll.print();
        System.out.println();

        ll.insertAtHead(10);

        ll.print();
        System.out.println();

        ll.insertAtPosition(2, 100);

        ll.print();
        System.out.println();

        ll.size();

        System.out.println(ll.get(3));

        System.out.println();

        ll.set(4, 200);
        ll.print();

        System.out.println();

        ll.deleteAtHead();
        ll.print();

        System.out.println();

        ll.deleteAtIndex(3);
        ll.print();

        sc.close();
    }
}