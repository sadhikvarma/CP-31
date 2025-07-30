import java.io.*;
import java.util.*;

public class Sixteen {
    public static void solve(String word, String check) {
        int check_len = check.length();
        int word_len = word.length(); 
        Map<Character, Integer> freqmap = new HashMap<>();

        for (char ch : check.toCharArray()) {
            freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder(word);

        for (int i = word_len - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (freqmap.getOrDefault(ch, 0) != 0) {
                freqmap.put(ch, freqmap.get(ch) - 1);
            } else {
                sb.setCharAt(i, '.');
            }
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < word_len; i++) {
            if (sb.charAt(i) != '.') {
                res.append(sb.charAt(i));
            }
        }

        if (res.toString().equals(check))
            System.out.println("Yes");
        else    
            System.out.println("No");
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            String[] parts = br.readLine().trim().split("\\s+");
            String word = parts[0];
            String check = parts[1];
            solve(word, check);
        }
    }
}
