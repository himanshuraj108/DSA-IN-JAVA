import java.util.*;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] arr = new String[n];

        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            int m = Integer.parseInt(arr[i]);
            mx = Math.max(mx, m);
        }

        System.out.println(mx);

        sc.close();
    }
}
