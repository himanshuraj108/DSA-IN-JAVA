import java.util.*;

// sorted like set of cpp 
// sorted TreeMap if string Alphabate wise
public class TreeSetTreeMaps {
    public static void main(String[] args) {
        TreeSet<Integer> Tset = new TreeSet<>();
        Tset.add(20);
        Tset.add(50);
        Tset.add(10);
        Tset.add(100);
        Tset.add(200);

        for (int ele : Tset) {
            System.out.println(ele);
        }

        System.out.println();

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Rahul", 100);

        for (String ele : map.keySet()) {
            System.out.println(ele);
        }

    }
}