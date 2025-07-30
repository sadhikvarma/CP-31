import java.io.*;
import java.util.*;

public class First {
    public static void solve(long a, long b, long xk, long yk, long xq, long yq) {
        Set<String> fromKing = new HashSet<>();
        Set<String> fromQueen = new HashSet<>();

        long[] dx = { a, a, -a, -a, b, b, -b, -b };
        long[] dy = { b, -b, b, -b, a, -a, a, -a };

        for (int i = 0; i < 8; i++) {
            long x1 = xk - dx[i];
            long y1 = yk - dy[i];
            fromKing.add(x1 + "," + y1);

            long x2 = xq - dx[i];
            long y2 = yq - dy[i];
            fromQueen.add(x2 + "," + y2);
        }

        int count = 0;
        for (String pos : fromKing) {
            if (fromQueen.contains(pos)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            long a = Long.parseLong(parts[0]);
            long b = Long.parseLong(parts[1]);

            String[] parts1 = br.readLine().trim().split(" ");
            long xk = Long.parseLong(parts1[0]);
            long yk = Long.parseLong(parts1[1]);

            String[] parts2 = br.readLine().trim().split(" ");
            long xq = Long.parseLong(parts2[0]);
            long yq = Long.parseLong(parts2[1]);

            solve(a, b, xk, yk, xq, yq);
        }
    }
}
