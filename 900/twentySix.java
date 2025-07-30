import java.io.*;

public class twentySix {
    public static void solve(long n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            solve(n);
        }
    }
}
