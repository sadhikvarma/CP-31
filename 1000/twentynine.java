import java.io.*;

public class twentynine {
    public static void solve(long a, long b) {
        if (a == b) {
            System.out.println(0);
            return;
        }

        long big = Math.max(a, b);
        long small = Math.min(a, b);

        if (big % small != 0) {
            System.out.println(-1);
            return;
        }

        long ratio = big / small;

        if ((ratio & (ratio - 1)) != 0) {
            System.out.println(-1);
            return;
        }

        int steps = 0;
        while (ratio > 1) {
            if (ratio % 8 == 0) {
                ratio /= 8;
                steps++;
            } else if (ratio % 4 == 0) {
                ratio /= 4;
                steps++;
            } else if (ratio % 2 == 0) {
                ratio /= 2;
                steps++;
            }
        }

        System.out.println(steps);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);
            solve(a, b);
        }
    }
}
