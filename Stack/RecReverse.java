import java.util.Scanner;
import java.util.Stack;

public class RecReverse {
    public static void Original(Stack<Integer> st) {
        if (st.empty())
            return;

        int top = st.pop();
        Original(st);
        System.out.print(top + " ");
        st.push(top);
    }

    public static void Reverse(Stack<Integer> st) {
        if (st.empty())
            return;

        int top = st.pop();
        System.out.print(top + " ");
        Reverse(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            st.push(ele);
        }

        Original(st);
        System.out.println();
        Reverse(st);

        sc.close();
    }

}
