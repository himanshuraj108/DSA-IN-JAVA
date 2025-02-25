import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());

        char[] arr = str.toString().toCharArray();
        Arrays.sort(arr);
        for (char ele : arr) {
            System.out.print(ele);
        }

        sc.close();
    }

}
