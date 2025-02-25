import java.util.Scanner;
import java.util.Stack;

public class pushAtButtom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the stack:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }

        System.out.println("Original stack:");
        while (!st.isEmpty()) {
            temp.push(st.peek());
            System.out.print(temp.peek() + " ");
            st.pop();
        }
        System.out.println();

        System.out.println("Enter the element to be pushed at the bottom:");
        int bottomEle = sc.nextInt();
        st.push(bottomEle);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println("Modified stack:");
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " "); // System.out.print(st.pop() + " ");
            st.pop();
        }

        sc.close();
    }
}
