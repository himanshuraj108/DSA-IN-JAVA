import java.util.Scanner;

public class Ques7 {
    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        // reverse(str, 2, 9);
        // System.out.println(str);

        int i = 0, j = 0;
        int n = str.length();
        while (j < n) {
            if (str.charAt(j) != ' ') {
                j++;
            } else {
                reverse(str, i, j - 1);
                i = j + 1;
                j = i;
            }
        }

        // using for loop
        // for (int i = 0, j = 0; j < n; j++) {
        // if (str.charAt(j) == ' ') {
        // reverse(str, i, j - 1);
        // i = j + 1;
        // }
        // }

        reverse(str, i, j - 1); // for last word reverse
        System.out.println(str);

        sc.close();

    }

}
