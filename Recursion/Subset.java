import java.util.ArrayList;

public class Subset {
    static ArrayList<String> arr = new ArrayList<>();

    public static void printSubses(int i, String s, String ans) {
        if (i == s.length()) {
            arr.add(ans);
            return;
        }

        printSubses(i + 1, s, ans); // not take
        ans += s.charAt(i);
        printSubses(i + 1, s, ans); // take
    }

    public static void main(String[] args) {
        String s = "abcd";
        arr = new ArrayList<>();
        printSubses(0, s, "");
        System.out.println(arr);
    }

}
