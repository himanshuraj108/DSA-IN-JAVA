import java.util.Scanner;

public class MazePath {

    public static int Maze(int row, int col, int m, int n) {
        if (row == m || col == n)
            return 1;

        int rightWays = Maze(row, col + 1, m, n);
        int downWays = Maze(row + 1, col, m, n);
        return rightWays + downWays;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(Maze(1, 1, n, m));

        sc.close();

    }

}