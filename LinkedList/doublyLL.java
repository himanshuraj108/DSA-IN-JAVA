class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
    }

}

class DLL {
    Node head;
    Node tail;
    int size;

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (size == 0)
            head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (size == 0)
            head = tail = temp;
        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    void insertAtPos(int idx, int val) {
        Node temp = new Node(val);

        if (idx == size) {
            insertAtTail(val);
        }

        if (idx > size && idx < 0) {
            System.out.println("Invalid Index");
            return;
        }

        Node x = head;
        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }

        temp.next = x.next;
        x.next = temp;

    }

    void deleteAtHead() {
        if (head == null)
            System.out.println("List is empty");
        head = head.next;
        head.prev = null;
        size--;

    }

    void deleteAtTail() {
        if (head == null)
            System.out.println("List is empty");
        tail = tail.prev;
        tail.next = null;
        size--;

    }

    void deleteAtIndex(int idx) {
        if (idx == 0) {
            deleteAtHead();
        }

        if (idx == size - 1) {
            deleteAtTail();
        }

        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index");
        }

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;

    }

}

public class doublyLL {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void printReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Node a = new Node(10);
        // Node b = new Node(20);
        // Node c = new Node(30);
        // Node d = new Node(40);
        // Node e = new Node(50);

        // a.next = b;
        // b.prev = a;
        // b.next = c;
        // c.prev = b;
        // c.next = d;
        // d.prev = c;
        // d.next = e;
        // e.prev = d;

        // print(a);

        // printReverse(e);

        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAtHead(60);
        list.insertAtPos(2, 100);
        list.display();

        list.deleteAtHead();
        list.deleteAtTail();
        list.deleteAtIndex(2);
        list.display();
    }
}
