import java.util.Scanner;

public class WhyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println("Hey " + str + " Welcome!");
        System.out.println(str.length());
        System.out.println(str.charAt(4)); // starting from 0

        sc.close();
    }
}