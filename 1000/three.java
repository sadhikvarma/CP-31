import java.io.*;
import java.util.*;

public class three {
    public static void solve(int n, int p, int[] a, int[] b) {
        List<int[]> pairList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pairList.add(new int[]{a[i], b[i]}); 
        }

        pairList.sort(Comparator.comparingInt(pair -> pair[1]));

        long total = p; 
        long informed = 1; 

        for (int[] pair : pairList) {
            if (informed >= n) break;

            int capacity = pair[0];
            int costPerShare = pair[1];

            if (costPerShare >= p) break; 

            long canInform = Math.min(n - informed, capacity); 
            total += costPerShare * canInform;
            informed += canInform;
        }

        if (informed < n) {
            total += (n - informed) * (long)p;
        }

        System.out.println(total);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] parts = br.readLine().trim().split(" ");
            int n = Integer.parseInt(parts[0]);
            int p = Integer.parseInt(parts[1]);

            int[] a = new int[n];
            int[] b = new int[n];

            String[] parts1 = br.readLine().trim().split(" ");
            String[] parts2 = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts1[i]);
                b[i] = Integer.parseInt(parts2[i]);
            }

            solve(n, p, a, b);
        }
    }
}
