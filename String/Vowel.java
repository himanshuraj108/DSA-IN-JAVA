import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            // char ch = charAt(i);
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                found = true;
                count++;
            }
        }

        if (found) {
            System.out.println(count);
        }

        else {
            System.out.println("None");
        }

        sc.close();
    }

}
