import java.util.Scanner;

public class containstartWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.contains("a")); // word sentence
        System.out.println(str.startsWith("Ra"));

        sc.close();
    }

}
