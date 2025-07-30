import java.io.*;
import java.util.*;

public class Second {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(parts[0]);
            int k = Integer.parseInt(parts[1]);

            String s = br.readLine();
            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            int oddCount = 0;
            for (int f : freq) {
                if (f % 2 != 0) oddCount++;
            }

            if (oddCount <= k + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
