class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node temp = a;
        // Node temp = new Node(100); // deep copy
        System.out.println(a.val);
        System.out.println(temp.val);

    }

}
