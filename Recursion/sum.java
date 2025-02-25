import java.util.Scanner;

public class sum {

    public static int SUM(int n) {
        if (n == 0)
            return 0;

        return n + SUM(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SUM(n));
        sc.close();
    }

}
