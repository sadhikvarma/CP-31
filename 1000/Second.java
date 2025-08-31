import java.io.*;
import java.util.*;

public class Second {
    static void solve(int[] a, int n, int k) {
        if (k == 2 || k == 3 || k == 5) {
            int ans = Integer.MAX_VALUE;
            for (int x : a) {
                int r = x % k;
                int need = (k - r) % k;
                ans = Math.min(ans, need);
                if (ans == 0) break;
            }
            System.out.println(ans);
            return;
        }

        // k == 4
        int evens = 0;
        boolean hasMod4 = false;
        boolean hasRem3 = false;
        int minToMod4 = Integer.MAX_VALUE; // minimal ops to make some element %4==0

        for (int x : a) {
            int r4 = x % 4;
            if (r4 == 0) hasMod4 = true;
            if (x % 2 == 0) evens++;
            if (r4 == 3) hasRem3 = true;

            int need0 = (4 - r4) % 4; // cost to reach divisible by 4
            minToMod4 = Math.min(minToMod4, need0);
        }

        if (hasMod4 || evens >= 2) {
            System.out.println(0);
        } else if (evens == 1) {
            // Make any odd even with +1 (odd+1 is even). That guarantees v2 >= 2 total.
            System.out.println(1);
        } else {
            // No evens: either make one element %4==0, or make two odds even (+1 each)
            // If any rem==3 exists, minToMod4==1; else it's 3 (all rem==1).
            // Best is min(minToMod4, 2).
            int ans = Math.min(minToMod4, 2);
            System.out.println(ans);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());
            solve(a, n, k);
        }
    }
}
