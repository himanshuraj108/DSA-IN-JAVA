import java.util.Scanner;

public class StringTraversal {

    public static void STR(int i, String Str) {
        if (i == Str.length())
            return;
        System.out.print(Str.charAt(i));
        STR(i + 1, Str);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        STR(3, str);

        sc.close();
    }

}
