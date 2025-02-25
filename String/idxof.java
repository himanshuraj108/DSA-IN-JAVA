import java.util.Scanner;

public class idxof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str.indexOf('h'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.compareTo(str2));

        sc.close();
    }

}
