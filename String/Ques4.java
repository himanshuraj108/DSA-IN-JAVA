import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) { // Capital
                ascii += 32;
                ch = (char) ascii;
                str.setCharAt(i, ch);
            }

            else if (ascii >= 97 && ascii <= 122) { // Small
                ascii -= 32;
                ch = (char) ascii;
                str.setCharAt(i, ch);
            }
        }

        System.out.println(str);

        sc.close();
    }

}
