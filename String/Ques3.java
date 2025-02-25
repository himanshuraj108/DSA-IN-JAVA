import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String newName = "";

        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0) {
                newName += 'a';
            }

            else {
                newName += name.charAt(i);
            }
        }

        System.out.println(newName);

        sc.close();
    }

}
