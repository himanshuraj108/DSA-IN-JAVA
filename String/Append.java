import java.util.Scanner;

public class Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println(str);

        str.append(35);
        System.out.println(str);

        str.append(" Raj");
        System.out.println(str);

        char[] ch = { 'r', 'a', 'h' };
        str.append(ch);
        System.out.println(str);

        int arr[] = { 1, 2, 3, 4 };
        str.append(arr); // does not work, address is appended
        System.out.println(str);

        sc.close();

    }

}
