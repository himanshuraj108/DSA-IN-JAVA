import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // int i = 0;
        // while (str.length() != 0) {
        // System.out.println(str);
        // str = str.substring(1);

        // i++;

        // }

        // for (int i = 1; i <= str.length(); i++) {

        // System.out.print(str.substring(0, i) + " ");
        // System.out.println();
        // }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; i <= str.length(); i++) {

                System.out.print(str.substring(i, j) + " ");
            }

            sc.close();
        }

    }
}
