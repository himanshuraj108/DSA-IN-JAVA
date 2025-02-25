import java.util.*;

public class stl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // for reverse

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            pq.add(ele);
        }

        int rem = sc.nextInt();
        pq.remove(rem);

        for (int ele : pq) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
