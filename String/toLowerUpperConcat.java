import java.util.Scanner;

public class toLowerUpperConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String str2 = sc.nextLine();
        System.out.println(str.concat(" " + str2));

        sc.close();

    }

}
