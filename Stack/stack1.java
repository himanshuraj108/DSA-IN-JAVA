import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }

        Stack<Integer> temp = new Stack<>();

        System.out.print("Original Stack: ");
        while (st.size() > 0) {
            System.out.print(st.peek() + " ");
            temp.push(st.peek());
            st.pop();
        }

        System.out.println();

        System.out.print("Reversed Stack: ");
        while (!temp.isEmpty()) { // empty() is also
            System.out.print(temp.peek() + " ");
            temp.pop();

        }

        sc.close();
    }
}