import java.io.*;

public class ten {
    public static void solve(int n, char c, String s) {
        s = s + s; 
        int len = s.length();
        int[] nextG = new int[len];
        int lastG = -1;

        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == 'g') {
                lastG = i;
            }
            nextG[i] = lastG;
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                if (nextG[i] != -1) {
                    max = Math.max(max, nextG[i] - i);
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            char c = parts[1].charAt(0);
            String s = br.readLine().trim();

            solve(n, c, s);
        }
    }
}
