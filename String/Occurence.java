import java.util.*;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        int[] freq = new int[26];
        // 0-a, 1-b, 2-c,.....25-z;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') { // Only process lowercase letters
                int idx = ch - 'a';
                freq[idx]++;
            }
        }

        int maxFreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                char ch = (char) (i + 'a');
                System.out.print(ch + " ");
            }
        }

        sc.close();
    }
}
