
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        // this.next = null; // we can set but not required it's default
    }
}

public class ListNodeClass {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
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

        print(a);

        // System.out.println(a.val);
        // System.out.println(a.next.val);
        // System.out.println(a.next.next.val);
        // System.out.println(d.val);
        // System.out.println(e.val);
    }
}