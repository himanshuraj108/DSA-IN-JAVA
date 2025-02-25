import java.util.*;

public class N_1__1_N {
    public static void N_1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        N_1(n - 1);
    }

    public static void l_N(int n) {
        if (n == 0)
            return;
        l_N(n - 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        N_1(n);
        System.out.println();
        l_N(n);

        sc.close();
    }

}
