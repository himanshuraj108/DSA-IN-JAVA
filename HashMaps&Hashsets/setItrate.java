import java.util.HashSet;

public class setItrate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

        for (int ele : set) {
            System.out.print(ele + " ");
        }

        System.out.println();
        set.add(13);
        System.out.print(set);
        set.add(22);
        System.out.print(set);

    }
}
