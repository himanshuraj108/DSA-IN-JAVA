import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveEven {
    public static void removeEven(Queue<Integer> q) {
        if (q.isEmpty()) {
            System.out.println("Queue is empty");
        }

        while (q.size() > 0) {
            if (q.peek() % 2 == 0) {
                q.poll();
            } else {
                System.out.print(q.peek() + " ");
                q.poll();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            q.add(ele);

        }

        removeEven(q);

        sc.close();
    }
}
