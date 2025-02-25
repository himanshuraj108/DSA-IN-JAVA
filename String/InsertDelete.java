import java.util.Scanner;

public class InsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        str.deleteCharAt(3);
        System.out.println(str);

        str.delete(1, 3);
        System.out.println(str);

        str.insert(1, 2);
        System.out.println(str);

        str.insert(1, "A");
        System.out.println(str);

        sc.close();
    }

}
