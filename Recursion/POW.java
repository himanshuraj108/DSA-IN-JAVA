import java.util.Scanner;

public class POW {

    public static int Pow(int n, int p) {
        if (p == 0) {
            return 1;
        }

        return n * Pow(n, p - 1);
    }

    public static int Pow2(int n, int p) {
        if (p == 0)
            return 1;
        if (p % 2 == 0)
            return Pow2(n, p / 2) * Pow2(n, p / 2);
        else
            return Pow2(n, p / 2) * Pow2(n, p / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = Pow(n, p);
        int res2 = Pow2(n, p);
        System.out.println(res);
        System.out.println(res2);

        sc.close();

    }
}