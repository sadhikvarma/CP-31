import java.io.*;
import java.util.*;

public class Seven {
    public static void solve(int n, int[] a, int[] b) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                map1.put(a[i - 1], Math.max(map1.getOrDefault(a[i - 1], 0), count));
                count = 1;
            }
        }
        map1.put(a[n - 1], Math.max(map1.getOrDefault(a[n - 1], 0), count));

        count = 1;
        for (int i = 1; i < n; i++) {
            if (b[i] == b[i - 1]) {
                count++;
            } else {
                map2.put(b[i - 1], Math.max(map2.getOrDefault(b[i - 1], 0), count));
                count = 1;
            }
        }
        map2.put(b[n - 1], Math.max(map2.getOrDefault(b[n - 1], 0), count));

        int res = 0;
        Set<Integer> allKeys = new HashSet<>();
        allKeys.addAll(map1.keySet());
        allKeys.addAll(map2.keySet());

        for (int key : allKeys) {
            res = Math.max(res, map1.getOrDefault(key, 0) + map2.getOrDefault(key, 0));
        }

        System.out.println(res);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            String[] parts1 = br.readLine().trim().split(" ");
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
                b[i] = Integer.parseInt(parts1[i]);
            }
            solve(n, a, b);
        }
    }
}
