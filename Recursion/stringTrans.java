import java.util.Scanner;

public class stringTrans {

    public static void skip(int i, String Str, String ans) {
        if (i == Str.length()) {
            System.out.print(ans);
            return;
        }

        if (Str.charAt(i) != 'a')
            ans += Str.charAt(i);
        skip(i + 1, Str, ans);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        skip(0, str, "");

        sc.close();
    }

}
