import java.io.*;
import java.util.*;

public class twentyseven {
    public static boolean isFair(long x) {
        long original = x;
        while (x > 0) {
            int digit = (int)(x % 10);
            x /= 10;
            if (digit != 0 && (original % digit != 0)) {
                return false;
            }
        }
        return true;
    }

    public static void solve(BufferedReader br) throws IOException {
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long x = n;
            while (!isFair(x)) {
                x++;
            }
            System.out.println(x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve(br);
    }
}
