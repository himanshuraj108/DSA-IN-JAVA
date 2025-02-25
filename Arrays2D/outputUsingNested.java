
import java.util.Scanner;

public class outputUsingNested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // column
                arr[i][j] = sc.nextInt();
            }
        }

        for (

                int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) { // column
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
