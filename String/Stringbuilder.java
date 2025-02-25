public class Stringbuilder {
    public static void main(String[] args) {
        String name = "Rahul";
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(name);
        System.out.println(sb);
        StringBuilder x = new StringBuilder("");
        System.out.println(x.length());
        sb.setCharAt(1, 'H');
        System.out.println(sb);

    }

}
