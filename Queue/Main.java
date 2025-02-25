class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            this.size++;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
        this.size++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = this.front.data;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        this.size--;
        return data;
    }

    // Get the front element of the queue
    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return this.front.data;
    }

    // Get the size of the queue
    public int getSize() {
        return this.size;
    }
}

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
        System.out.println("Queue size: " + queue.getSize());
    }
}
