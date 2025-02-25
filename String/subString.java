import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.substring(2));

        System.out.println(str.substring(2, 8));

        // String str = "" // empty String

        sc.close();
    }

}
