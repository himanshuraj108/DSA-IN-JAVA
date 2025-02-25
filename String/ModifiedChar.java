public class ModifiedChar {
    public static void main(String[] args) {
        String name = "Rahul";
        name = name.substring(0, 2) + "y" + name.substring(3);
        System.out.println(name);
    }
}