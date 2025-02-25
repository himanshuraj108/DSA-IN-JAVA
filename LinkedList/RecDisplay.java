class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class RecDisplay {

    public static void display(Node head) {
        if (head == null)
            return;

        System.out.println(head.val);
        display(head.next);
        // System.out.println(head.val); //it will print reversed by rec

    }

    public static void main(String[] args) {
        Node a = new Node(10); // head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }

}
