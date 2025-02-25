import java.util.HashSet;

public class basicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        System.out.println(set);
        System.out.println(set.contains(100)); // true or false
        System.out.println(set.size());
        set.remove(100);
        System.out.println(set);
        System.out.println(set.size());
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
