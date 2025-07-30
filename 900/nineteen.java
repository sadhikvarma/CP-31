import java.io.*;

public class nineteen {
    public static void solve(long x, long n) {
        long final_pos;

        int r = (int)(n % 4);
        if (r == 0) {
            final_pos = 0;
        } else if (r == 1) {
            final_pos = -n;
        } else if (r == 2) {
            final_pos = 1;
        } else { 
            final_pos = n + 1;
        }

        if (x % 2 == 0)
            System.out.println(x + final_pos);
        else
            System.out.println(x - final_pos);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            long x = Long.parseLong(parts[0]);
            long n = Long.parseLong(parts[1]);

            solve(x, n);
        }
    }
}
