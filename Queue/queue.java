import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>(); // also new LinkedList<>()
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            q.add(ele);

        }

        q.poll();

        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            q.poll();
        }

        sc.close();

    }
}