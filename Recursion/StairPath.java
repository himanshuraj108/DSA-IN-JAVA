import java.util.Scanner;

public class StairPath {

    public static int SP(int n) {
        if (n <= 2) {
            return n;
        }

        return SP(n - 1) + SP(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = SP(n);
        System.out.println(res);

        sc.close();
    }

}
