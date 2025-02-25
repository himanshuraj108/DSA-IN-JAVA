import java.util.HashMap;

public class MapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Rahul", 70);
        map.put("Ritik", 80);
        map.put("Himanshu", 100);
        map.put("Shivanshu", 90);
        // System.out.println(map);
        // System.out.println(map.containsKey("Raghav")); // true or false
        // System.out.println(map.containsValue(80));
        // System.out.println(map.size());
        // System.out.println(map.get("Rahul"));
        // map.remove("Ritik");
        // System.out.println(map);
        // System.out.println(map.keySet());
        for (String ele : map.keySet()) {
            System.out.println(ele + " " + map.get(ele));
        }

        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
