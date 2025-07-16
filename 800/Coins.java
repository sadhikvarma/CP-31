import java.io.*;

public class Coins {
    public static void solve(long n, long k) {
        if (n % 2 == 0) {
            System.out.println("YES");
        } else if (n >= k && k % 2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            
            String[] parts = br.readLine().trim().split(" ");
            long n = Long.parseLong(parts[0]);
            long k = Long.parseLong(parts[1]);
            solve(n, k);
        }
    }
}