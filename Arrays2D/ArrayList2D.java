import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);

        List<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);

        for (int ele : arr) {
            System.out.println(ele);
        }

        sc.close();
    }

}
